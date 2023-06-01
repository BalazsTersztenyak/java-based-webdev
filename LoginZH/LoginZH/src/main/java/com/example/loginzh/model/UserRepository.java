package com.example.loginzh.model;

import java.util.ArrayList;

public class UserRepository {
    private static UserRepository instance;
    private ArrayList<User> users;

    public static UserRepository getInstance() {
        if (instance == null) {
            instance = new UserRepository();
        }
        return instance;
    }

    private UserRepository() {
        users = new ArrayList<>();
        addUser(new User( "xyz@gmail.com", "123456"));
        addUser(new User( "xyz@freemail.hu", "test"));
        addUser(new User( "xyz@hotmail.com", "valami"));
    }

    public void addUser(User newUser) {
        users.add(newUser);
    }

    public User findUser(String email) {
        return users.stream().filter(x -> x.getEmail().equalsIgnoreCase(email))
                .findFirst()
                .orElse(null);
    }
}
