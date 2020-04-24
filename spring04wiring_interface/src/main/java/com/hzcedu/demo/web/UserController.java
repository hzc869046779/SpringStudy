package com.hzcedu.demo.web;

import com.hzcedu.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;

/**
 * @ClassName UserController
 * @Description 控制层
 * @Author hzc
 * @Date 2020/4/22 18:03
 * @Version 1.0
 */

//@Component
@Controller
public class UserController {
    @Autowired
    @Qualifier("normal")
    private UserService userService;

    public void add(){
        userService.add();
    }

}
