package com.hzcedu.demo;

import com.hzcedu.demo.soundsystem.CDPlayer;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @ClassName CDPlayerTest
 * @Description TODO
 * @Author hzc
 * @Date 2020/4/24 10:18
 * @Version 1.0
 */

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext-constructor.xml")
public class CDPlayerTest {

    @Autowired
    private CDPlayer cdPlayer1;

    @Autowired
    private CDPlayer cdPlayer2;

    @Autowired
    private CDPlayer cdPlayer3;

    @Test
    public void Test01(){
        cdPlayer1.play();
    }

    @Test
    public void Test02(){
        cdPlayer2.play();
    }

    @Test
    public void Test03(){
        cdPlayer3.play();
    }

}
