package fr.esiea.restservice;

import org.aspectj.bridge.Message;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.util.Base64;
import java.util.Optional;

@Controller
@RequestMapping(path = "/app")
public class MainController {
    @Autowired // This means to get the bean called userRepository
    // Which is auto-generated by Spring, we will use it to handle the data
    private UserRepository userRepository;

    @PostMapping(path="/add") // Map ONLY POST Requests
    public @ResponseBody String addNewUser (@RequestParam String name, @RequestParam String email) {
        // @ResponseBody means the returned String is the response, not a view name
        // @RequestParam means it is a parameter from the GET or POST request
        User n = new User();
        n.setName(name);
        n.setEmail(email);
        userRepository.save(n);
        return "\nSaved";
    }

    @PostMapping(path="/signup") // MAP POST signup request
    public @ResponseBody String signUpUser(@RequestParam String name, @RequestParam String email, @RequestParam String login, @RequestParam String password) throws NoSuchAlgorithmException {
        // Fonction qui se charge de gérer l'inscription d'un utilisateur
        User user = new User();
        user.setName(name);
        user.setEmail(email);
        user.setUserLogin(login);
        MessageDigest digest = MessageDigest.getInstance("MD5");
        byte[] hashedUserPassword = digest.digest(password.getBytes());
        String userPassword = new String(hashedUserPassword, StandardCharsets.UTF_8);
        user.setUserPassword(userPassword);
        userRepository.save(user);
        return "\n"+name+" signed up.\n";
    }

    @PostMapping(path="/login") // MAP POST login request
    public @ResponseBody String loginUser(@RequestParam String login, @RequestParam String password) throws NoSuchAlgorithmException {
        // Fonction qui se charge de gérer le login d'un utilisateur
        String token = null;
        String userToken = null;
        Token uToken = null;
        SecureRandom random = new SecureRandom();
        Base64.Encoder encoder = Base64.getUrlEncoder();
        byte[] randomBytes = new byte[24];
        random.nextBytes(randomBytes);
        User requestedUser = userRepository.findByUserLogin(login);
        if (requestedUser.getUserLogin().equals(login)){
            MessageDigest digest = MessageDigest.getInstance("MD5");
            byte[] hashedUserPassword = digest.digest(password.getBytes());
            String verifyPassword = new String(hashedUserPassword, StandardCharsets.UTF_8);
            if (requestedUser.getUserPassword().equals(verifyPassword)){
                userToken = encoder.encodeToString(randomBytes);
                uToken = new Token(userToken);
                token = "\nThe password is correct. " + requestedUser.getName() + " successfully logged in. User token expires on: " + uToken.getDateExpiring().toString() + "\n";
            } else {
                token = "\nThe password is incorrect. " + requestedUser.getName() + " tried to log in.\n";
            }
        }
        return token;
    }

    @GetMapping(path="/all")
    public @ResponseBody Iterable<User> getAllUsers() {
        // This returns a JSON or XML with the users
        return userRepository.findAll();
    }
}
