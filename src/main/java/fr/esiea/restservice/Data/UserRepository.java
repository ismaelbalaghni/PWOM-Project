package fr.esiea.restservice.Data;

import fr.esiea.restservice.Model.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

@Service
public interface UserRepository extends CrudRepository<User, Integer> {
    User findByUserLogin(String userLogin);
}
