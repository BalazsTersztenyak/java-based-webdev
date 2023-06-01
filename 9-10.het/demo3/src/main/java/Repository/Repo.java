package Repository;

import Model.User;

import java.util.ArrayList;

public class Repo {
    private ArrayList<User> users;
    private static Repo self;

    private Repo() {
        users = new ArrayList<>();
        users.add(new User("test","test","",""));
    }

    //singelton (csak egyszer legyen létrehozás)
    public static Repo GetInstance(){
        if (self == null)
            self = new Repo();
        return self;
    }

    public User getUserByUsername(String username){
        return this.users.stream().filter(
                x->x.getUsername().equals(username))
                .findFirst().orElse(null);
    }

    public void AddUser(User user){
        this.users.add(user);
    }
}
