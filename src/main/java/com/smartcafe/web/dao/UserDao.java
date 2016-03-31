package com.smartcafe.web.dao;

import com.smartcafe.web.model.User;

import java.util.List;

public interface UserDao {
    User findById(int id);

    User findBySSO(String sso);

    void saveUser(User film);

    void deleteById(int id);

    List<User> findAllUsers();
}
