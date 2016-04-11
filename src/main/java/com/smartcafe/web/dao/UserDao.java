package com.smartcafe.web.dao;

import com.smartcafe.web.model.User;

import java.util.List;

public interface UserDao extends GenericDao<User, Integer> {
    User findById(int id);

    void saveUser(User user);

    boolean deleteById(int id);

    List<User> findAllUsers();
}