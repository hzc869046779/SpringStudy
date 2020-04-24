package com.hzcedu.demo;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @ClassName AppTest
 * @Description TODO
 * @Author hzc
 * @Date 2020/4/24 18:47
 * @Version 1.0
 */

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext.xml")
public class AppTest {

    @Autowired
    Person person1;

    @Autowired
    Person person2;

    @Test
    public void test(){
        System.out.println(person1);
        System.out.println(person2);
    }

}
