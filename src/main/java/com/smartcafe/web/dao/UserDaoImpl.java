package com.smartcafe.web.dao;

import com.smartcafe.web.domain.User;
import org.springframework.stereotype.Repository;

@Repository
public class UserDaoImpl extends GenericDaoImpl<User, Integer> implements UserDao {

}
