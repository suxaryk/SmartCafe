package com.smartcafe.web.service;

import com.smartcafe.web.model.User;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service("DishService")
@Transactional
public class DishServiceImpl implements DishService{

    @Override
    public User findById(int id) {
        return null;
    }

    @Override
    public User findBySSO(String sso) {
        return null;
    }

    @Override
    public void saveUser(User user) {

    }

    @Override
    public void updateUser(User user) {

    }

    @Override
    public void deleteUserBySSO(String sso) {

    }

    @Override
    public List<User> findAllUsers() {
        return null;
    }

    @Override
    public boolean isUserSSOUnique(Integer id, String sso) {
        return false;
    }
}
