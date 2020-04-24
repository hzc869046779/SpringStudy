package com.hzcedu.demo.web;

import com.hzcedu.demo.config.AppConfig;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

/**
 * @ClassName UserControllerTest
 * @Description TODO
 * @Author hzc
 * @Date 2020/4/22 18:06
 * @Version 1.0
 */

@RunWith(SpringJUnit4ClassRunner.class)
//@ContextConfiguration(classes = AppConfig.class)

//使用xml方式配置
@ContextConfiguration("classpath:applicationContext.xml")
public class UserControllerTest {
    @Resource(name = "userController")
    private UserController userController;

    @Test
    public void add(){
        userController.add();
    }
}
