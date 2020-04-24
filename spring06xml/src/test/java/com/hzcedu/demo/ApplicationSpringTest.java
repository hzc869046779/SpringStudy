package com.hzcedu.demo;

import com.hzcedu.demo.soundsystem.CompactDisc;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @ClassName ApplicationSpringTest
 * @Description TODO
 * @Author hzc
 * @Date 2020/4/23 22:17
 * @Version 1.0
 */

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext-constructor.xml")
public class ApplicationSpringTest {
    @Autowired
    private CompactDisc compactDisc1;

    @Autowired
    private CompactDisc compactDisc2;

 /*   @Autowired
    private CompactDisc compactDisc2;

    @Autowired
    @Qualifier("compactDisc2")
    private CompactDisc compactDisc3;*/

    @Test
    public void test(){
        compactDisc1.play();
       /* compactDisc2.play();
        compactDisc3.play();*/
    }

    @Test
    public void test1(){
        compactDisc2.play();
    }
}
