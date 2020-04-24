package com.hzcedu.demo;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

/**
 * @ClassName Notepad
 * @Description TODO
 * @Author hzc
 * @Date 2020/4/24 17:48
 * @Version 1.0
 */

//@Scope("prototype")
public class Notepad3 {
    public Notepad3() {
        super();
        System.out.println("notepad3 构造函数");
    }

    @PostConstruct
    public void init(){
        System.out.println("这是notepad初始化方法");
    }


    @PreDestroy
    public void destroy(){
        System.out.println("notepad资源释放");
    }
}
