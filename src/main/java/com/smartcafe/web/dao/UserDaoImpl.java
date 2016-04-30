package com.smartcafe.web.dao;

import com.smartcafe.web.model.User;
import org.springframework.stereotype.Repository;

@Repository
public class UserDaoImpl extends GenericDaoImpl<User, Integer> implements UserDao {

}
