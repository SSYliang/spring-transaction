package com.spring.spring_trans04;

import com.spring.spring_trans04.service.UserService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SpringTrans04ApplicationTests {

    @Autowired
    UserService userService;

    @Test
    void contextLoads() {
        userService.transfer();
    }

}
