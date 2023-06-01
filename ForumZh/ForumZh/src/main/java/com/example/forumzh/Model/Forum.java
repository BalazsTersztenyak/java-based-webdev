package com.example.forumzh.Model;

import java.util.ArrayList;

public class Forum {
    private ArrayList<User> users;
    private ArrayList<Comment> comments;

    public Forum(ArrayList<User> users, ArrayList<Comment> comments) {
        this.users = users;
        this.comments = comments;
    }

    public Forum() {
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

    public User findUserById(int id){
        return users.stream().filter(u ->u.getId() == id).findFirst().orElse(null);
    }

    public void addUser(User u) {
        users.add(u);
    }

    public void addComment(Comment c){
        comments.add(c);
    }

    public ArrayList<Comment> getComments() {
        return comments;
    }

    public void setComments(ArrayList<Comment> comments) {
        this.comments = comments;
    }

    public ArrayList<User> getUsers() {
        return users;
    }

    public void setUsers(ArrayList<User> users) {
        this.users = users;
    }
}
