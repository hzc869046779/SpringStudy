package com.hzcedu.demo.dervice;

import com.hzcedu.demo.config.AppConfig;
import com.hzcedu.demo.service.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

/**
 * @ClassName UserServiceTest
 * @Description TODO
 * @Author hzc
 * @Date 2020/4/22 17:30
 * @Version 1.0
 */

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = AppConfig.class)
public class UserServiceTest {

   /* @Autowired
    //使用限定符接触歧义
    @Qualifier("festival")*/
    @Resource(name = "festival")  //同时代替了Autowired和Qualifier功能
    private UserService userService;

    @Test
    public void testAdd(){
        userService.add();
    }


}
