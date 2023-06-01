package com.example.loginzh.model;

import org.apache.commons.codec.digest.DigestUtils;

public class User {
    private String email;
    private String passwordHash;
    private int loginCounter;

    public User(String email, String password) {
        this.email = email;
        this.loginCounter = 0;
        setPasswordHash(password);
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPasswordHash() {
        return passwordHash;
    }

    public void setPasswordHash(String password) {
        this.passwordHash = DigestUtils.md5Hex(password);
    }

    public int getLoginCounter() {
        return loginCounter;
    }

    public void setLoginCounter(int loginCounter) {
        this.loginCounter = loginCounter;
    }

    public void addLogin()
    {
        this.loginCounter=this.loginCounter+1;
    }

    public Boolean passwordIsEqual(String password)
    {
        String passwHash = DigestUtils.md5Hex(password);
        return this.passwordHash.equals(passwHash);
    }
}
