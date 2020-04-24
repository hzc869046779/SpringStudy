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
 * @Date 2020/4/24 17:50
 * @Version 1.0
 */

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext.xml")
public class AppTest {

    /**
     * 1 无论是否主动去获取bean对象，spring上下文一加载就会去加载bean对象
     * 2 无论获取多少次，拿到的都是同一个对象
     */

    @Autowired
    private Notepad notepad;

    @Test
    public void name() {
    }
}
