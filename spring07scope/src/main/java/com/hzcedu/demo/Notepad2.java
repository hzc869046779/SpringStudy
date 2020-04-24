package com.hzcedu.demo;

import org.springframework.context.annotation.Lazy;
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

@Component
//@Scope("prototype")
@Scope(scopeName = "prototype")
//@Lazy 只能和singleton匹配
public class Notepad2 {
    public Notepad2() {
        super();
        System.out.println("notepad2 构造函数");
    }

    @PostConstruct  //初始化方法
    public void init(){
        System.out.println("这是notepad2初始化方法");
    }


    @PreDestroy //销毁方法 / scope=prototype时候不会调用销毁方法
    public void destroy(){
        System.out.println("notepad2资源释放");
    }
}
