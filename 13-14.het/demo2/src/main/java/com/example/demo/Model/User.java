package com.example.demo.Model;

public class User
{
    private String username;
    private String password;
    private String address;

    public User(String username, String password, String address) {
        this.username = username;
        this.password = password;
        this.address = address;
    }

    public boolean isPasswordCorrect(String psw){
        return this.password.equals(psw);
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public String getAddress() {
        return address;
    }
}
