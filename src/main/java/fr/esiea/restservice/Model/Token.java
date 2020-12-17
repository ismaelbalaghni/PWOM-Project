package fr.esiea.restservice.Model;

import org.apache.tomcat.util.log.SystemLogHandler;

import javax.persistence.Entity;
import java.util.Date;

public class Token {

    private String token;

    private Date dateIssued;

    private Date dateExpiring;

    public Token(String token) {
        this.token = token;
        this.dateIssued = new Date();
        this.dateExpiring = new Date();
        this.setDateIssued();
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

    public void setDateIssued() {
        long tokenTTL = 0;
        System.out.println(tokenTTL);
        System.out.println(this.dateIssued.getTime());
        tokenTTL = this.dateIssued.getTime() + 1800;
        System.out.println(tokenTTL);
        this.dateExpiring.setTime(tokenTTL);
        System.out.println(this.dateExpiring.toString());
    }

    public Date getDateExpiring() {
        return dateExpiring;
    }
}
