package com.hzcedu.demo.config;

import com.hzcedu.demo.dao.UserDao;
import com.hzcedu.demo.service.UserService;
import com.hzcedu.demo.web.UserController;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * @ClassName AppConfig
 * @Description TODO
 * @Author hzc
 * @Date 2020/4/22 15:06
 * @Version 1.0
 */

@Configuration
//@ComponentScan("com.hzcedu.demo")
//@ComponentScan(basePackages = {"com.hzcedu.demo.web","com.hzcedu.demo.service","com.hzcedu.demo.dao"})
@ComponentScan(basePackageClasses = {UserController.class, UserService.class, UserDao.class})
public class AppConfig {

}
