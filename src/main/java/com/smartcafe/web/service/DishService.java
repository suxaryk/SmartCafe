package com.smartcafe.web.service;

import com.smartcafe.web.model.User;
import org.springframework.stereotype.Service;

import java.util.List;

public interface DishService {
    User findById(int id);

    User findBySSO(String sso);

    void saveUser(User user);

    void updateUser(User user);

    void deleteUserBySSO(String sso);

    List<User> findAllUsers();

    boolean isUserSSOUnique(Integer id, String sso);
}
