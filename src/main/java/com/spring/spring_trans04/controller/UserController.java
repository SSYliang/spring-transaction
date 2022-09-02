package com.spring.spring_trans04.controller;

import com.spring.spring_trans04.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
    @Autowired
    UserService userService;

    @GetMapping("/transfer")
    public void transfer(){
        userService.transfer();
    }
}
