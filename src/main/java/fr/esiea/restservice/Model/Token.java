package fr.esiea.restservice.Model;

import java.time.LocalDateTime;

public class Token {

    private String token;

    private LocalDateTime dateIssued;

    private LocalDateTime dateExpiring;

    private boolean validToken;

    public Token(String token) {
        this.token = token;
        this.dateIssued = LocalDateTime.now();
        this.dateExpiring = LocalDateTime.now();
        this.setDateExpiring();
        this.validToken = true;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public LocalDateTime getDateIssued() {
        return dateIssued;
    }

    public void setDateExpiring() {
        System.out.println(this.dateExpiring.toString());
        this.dateExpiring = this.dateIssued.plusMinutes(30);
        System.out.println(this.dateExpiring.toString());
    }

    public LocalDateTime getDateExpiring() {
        return dateExpiring;
    }

    public boolean isValidToken() {
        return validToken;
    }

    public boolean renewToken(){
        this.validToken = false;
        this.dateIssued = LocalDateTime.now();
        this.setDateExpiring();
        this.validToken = true;

        return this.validToken;
    }
}
