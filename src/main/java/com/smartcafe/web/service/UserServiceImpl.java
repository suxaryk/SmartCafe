package com.smartcafe.web.service;

import com.smartcafe.web.model.User;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl extends GenericServiceImpl<User, Integer> implements UserService {
    @Override
    public User findById(int id) {
        return null;
    }

    @Override
    public void saveUser(User user) {

    }

    @Override
    public boolean deleteById(int id) {
        return false;
    }

    @Override
    public List<User> findAllUsers() {
        return null;
    }
}
