package com.example.forumzh.Model;

import java.util.ArrayList;

public class ForumRepo {
    private static ForumRepo instance;
    private ArrayList<User> users;
    private ArrayList<Comment> comments;

    public static ForumRepo getInstance(){
        if(instance == null) {
            instance = new ForumRepo();
        }
        return instance;
    }

    public ForumRepo() {
        users = new ArrayList<>();
        comments = new ArrayList<>();
        Forum f = new Forum(users, comments);

        f.addUser(new User(1,"asd@gmail.com", "lajcsi", "Nagy Lajos", "asd123"));
        f.addUser(new User(2,"dsa@gmail.com", "jancsi", "Kis Janos", "1234"));
        f.addUser(new User(3,"lol@gmail.com", "zoli", "Kerkk Zoltán", "9876"));

        f.addComment(new Comment("asdafawefawfawfawf awdawd 1 ", 1));
        f.addComment(new Comment("Kettes id kommentelo ", 3));
        f.addComment(new Comment("harmas id kommentelo ", 2));

    }

    public User findUser(String nickname) {
        return users.stream().filter(a ->a.getNickname().equals(nickname)).findFirst().orElse(null);
    }

    public User findUserById(int id){
        return users.stream().filter(u ->u.getId() == id).findFirst().orElse(null);
    }


    public ArrayList<User> getUsers() {return  users;}

    public ArrayList<Comment> getComments() {return comments;}

}
