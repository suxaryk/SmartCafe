package com.smartcafe.web.dao;

import com.smartcafe.web.domain.User;
import org.springframework.stereotype.Repository;

@Repository
public class UserDao extends GenericDaoImpl<User, Long> implements GenericDao<User, Long> {

}
