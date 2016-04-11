package com.smartcafe.web.service;

import com.smartcafe.web.model.User;

import java.util.List;


public interface UserService extends GenericService<User,Integer>{
    User findById(int id);

    void saveUser(User user);

    boolean deleteById(int id);

    List<User> findAllUsers();

}
