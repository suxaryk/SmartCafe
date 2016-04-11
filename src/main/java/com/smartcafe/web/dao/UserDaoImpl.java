package com.smartcafe.web.dao;

import com.smartcafe.web.model.User;
import org.hibernate.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class UserDaoImpl extends GenericDaoImpl<User, Integer> implements UserDao {

    @Override
    public User findById(int id) {
        return find(id);
    }

    @Override
    public void saveUser(User user) {
        saveUser(user);
    }

    @Override
    public boolean deleteById(int id) {
        Query userTaskQuery = currentSession().createQuery(
                "from User u where :id");
        userTaskQuery.setParameter("id", id);
        return userTaskQuery.executeUpdate() > 0;
    }

    @SuppressWarnings("uncheked")
    @Override
    public List<User> findAllUsers() {
        return getAll();
    }
}
