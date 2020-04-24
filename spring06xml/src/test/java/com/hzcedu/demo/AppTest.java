package com.hzcedu.demo;

import com.hzcedu.demo.soundsystem.CDPlayer;
import com.hzcedu.demo.soundsystem.CompactDisc;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @ClassName AppTest
 * @Description TODO
 * @Author hzc
 * @Date 2020/4/24 17:09
 * @Version 1.0
 */

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext-property.xml")
public class AppTest {



    @Autowired
    private CDPlayer cdPlayer;

    @Test
    public void test(){
        cdPlayer.play();
    }

}
