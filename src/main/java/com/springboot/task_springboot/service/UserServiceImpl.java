package com.springboot.task_springboot.service;

import com.springboot.task_springboot.dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.springboot.task_springboot.model.User;

import java.util.List;
@Service
public class UserServiceImpl implements UserService{
    private final UserDao userDao;
    @Autowired
    public UserServiceImpl(UserDao userDao) {
        this.userDao = userDao;
    }

    public List<User> readAllUsers() {
        return userDao.readAllUsers();
    }

    public void create(User user) {
        userDao.create(user);
    }

    public User update(int id) {
        return userDao.update(id);
    }

    public void delete(int id) {
        userDao.delete(id);
    }
}
