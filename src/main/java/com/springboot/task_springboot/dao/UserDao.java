package com.springboot.task_springboot.dao;

import com.springboot.task_springboot.model.User;

import java.util.List;

public interface UserDao {
    List<User> readAllUsers();
    void create(User user);

    User update(int id);

    void delete(int id);
}
