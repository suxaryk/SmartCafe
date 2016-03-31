package com.smartcafe.web.dao;

import com.smartcafe.web.model.User;
import org.hibernate.Hibernate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository("userDao")
public class UserDaoImpl extends AbstractDao<Integer, User> implements UserDao {

    @Override
    public User findById(int id) {
        return getByKey(id);
    }

    @Override
    public User findBySSO(String sso) {
        return null;
    }

    @Override
    public void saveUser(User film) {

    }

    @Override
    public void deleteById(int id) {

    }

    @Override
    public List<User> findAllUsers() {
        return null;
    }
}
