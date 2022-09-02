package com.spring.spring_trans04.service.impl;

import com.spring.spring_trans04.service.UserService2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

@Service
public class UserService2Impl implements UserService2 {
    @Autowired
    JdbcTemplate jdbcTemplate;

    @Override
    @Transactional(propagation = Propagation.NEVER)
    public void update() {
        jdbcTemplate.update("update user set money = ? where username = ?;",100,"李四");
        //int a = 1/0;
    }

//    @Override
//    @Transactional(propagation = Propagation.SUPPORTS)
//    public void update() {
//        jdbcTemplate.update("update user set money = ? where username = ?;",100,"李四");
//        //int a = 1/0;
//    }

//    @Override
//    @Transactional(propagation = Propagation.MANDATORY)
//    public void update() {
//        jdbcTemplate.update("update user set money = ? where username = ?;",100,"李四");
//        //int a = 1/0;
//    }

//    @Override
//    @Transactional(propagation = Propagation.NESTED)
//    public void update() {
//        jdbcTemplate.update("update user set money = ? where username = ?;",100,"李四");
//        int a = 1/0;
//    }

//    @Override
//    @Transactional(propagation = Propagation.REQUIRES_NEW)
//    public void update() {
//        jdbcTemplate.update("update user set money = ? where username = ?;",100,"李四");
////        int a = 1/0;
//    }

//    @Override
//    @Transactional
//    public void update() {
//        jdbcTemplate.update("update user set money = ? where username = ?;",100,"李四");
////        int a = 1/0;
//    }
}
