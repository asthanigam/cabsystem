package dao;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import models.User;

public class UserDao {
    private static final HashMap<Integer,User> users = new HashMap<>();
    private static int i = 0;
    public void saveUser(User user) {
        users.put(i++, user);
    }
    public List<User> getUsers() {
        return new ArrayList<User>(users.values());
    }
 
}
