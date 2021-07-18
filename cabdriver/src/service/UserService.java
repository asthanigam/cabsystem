package service;

import java.util.List;

import dao.UserDao;
import models.User;

public class UserService {
    private UserDao userDao = new UserDao();
    public void saveUser(User user)
    {
        userDao.saveUser(user);
        
    }
    public List<User> getUsers()
    {
        return userDao.getUsers();
    }
}
