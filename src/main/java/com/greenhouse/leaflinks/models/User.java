package com.greenhouse.leaflinks.models;


import com.sun.istack.NotNull;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class User {

    @Id
    @GeneratedValue
    private int id;

    @NotNull
    private String userName;

    @NotNull
    private String pwHash;

    public User() {}

    public User (String userName, String password) {
        this.userName=userName;
        this.pwHash= encoder.encode(password);
    }

    private static final BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();

    public String getUserName () {
        return userName;
    }

    public boolean isMatchingPassword(String password) {
        return encoder.matches(password, pwHash);
    }

}
