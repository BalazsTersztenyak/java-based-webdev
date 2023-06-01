package com.example.demo.Model;

import java.util.ArrayList;

public class UserRepo {
    private ArrayList<User> users;
    private static UserRepo self;

    private UserRepo() {
        this.users = new ArrayList<>();
        this.users.add(new User("Alma", "Alma", "alma@alma.com"));
    }

    public static UserRepo getInstance() {
        if (self == null)
            self = new UserRepo();
        return self;
    }

    public void addUser(User u){
        this.users.add(u);
    }

    public User getUserByName(String uname){
        return this.users.stream().filter(x->x.getUsername().equals(uname)).findFirst().orElse(null);
    }
}
