package com.spring.spring_trans04.service.impl;

import com.spring.spring_trans04.service.UserService;
import com.spring.spring_trans04.service.UserService2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    JdbcTemplate jdbcTemplate;
    @Autowired
    UserService2 userService2;

    @Override
    //@Transactional
    public void transfer() {
        jdbcTemplate.update("update user set money = ? where username = ?;",1000,"张三");
        userService2.update();
        //int a = 1/0;
    }

}
