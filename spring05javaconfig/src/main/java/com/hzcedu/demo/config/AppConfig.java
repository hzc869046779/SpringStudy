package com.hzcedu.demo.config;

import com.hzcedu.demo.dao.UserDao;
import com.hzcedu.demo.dao.impl.UserDaoNormal;
import com.hzcedu.demo.service.UserService;
import com.hzcedu.demo.service.impl.UserServiceNormal;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

/**
 * @ClassName AppConfig
 * @Description 手动装配。
 * @Author hzc
 * @Date 2020/4/23 16:29
 * @Version 1.0
 */


@Configuration
@ComponentScan("com.hzcedu.demo")
public class AppConfig {

    @Bean
    public UserDao userDaoNormal(){
        System.out.println("创建UserDaoNormal对象");
        return new UserDaoNormal();
    }

    @Bean
    public UserDao userDaoCache(){
        System.out.println("创建UserDaoCache对象");
        return new UserDaoNormal();
    }

    @Bean
    public UserService userServiceNormal(@Qualifier("userDaoNormal") UserDao userDao){
        System.out.println("创建userservice对象");
        //UserDao userDao = userDaoNormal();
        //return new UserServiceNormal(userDao);

        UserServiceNormal userService = new UserServiceNormal();
        userService.setUserDao(userDao);
        return userService;
    }
}
