package fr.esiea.restservice;

import java.util.Date;

public class Token {

    private String token;

    private Date dateIssued;

    private Date dateExpiring;

    public Token(String token) {
        this.token = token;
        this.dateIssued = new Date();
        this.dateExpiring = new Date();
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public Date getDateIssued() {
        return dateIssued;
    }

    public void setDateIssued(Date dateIssued) {
        long tokenTTL = 0;
        this.dateIssued = dateIssued;
        tokenTTL = this.dateIssued.getTime() + 1800;
        this.dateExpiring.setTime(tokenTTL);
    }

    public Date getDateExpiring() {
        return dateExpiring;
    }
}
