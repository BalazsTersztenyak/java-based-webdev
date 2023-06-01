package com.example.forumzh.Model;

public class User {
    private  int id;
    private String email;
    private String nickname;
    private String fullname;
    private String password;


    public User(int id, String email, String nickname, String fullname, String password) {
        this.id = id;
        this.email = email;
        this.nickname = nickname;
        this.fullname = fullname;
        this.password = password;
    }

    public boolean isPasswordCorrect(String pw){
        return password.equals(pw);
    }

    @Override
    public String toString() {
        return fullname;
    }

    public int getId() {
        return id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
