package com.hzcedu.demo;

/**
 * @ClassName Notepad
 * @Description TODO
 * @Author hzc
 * @Date 2020/4/24 17:48
 * @Version 1.0
 */
public class Notepad {
    public Notepad() {
        super();
        System.out.println("notepad 构造函数");
    }

    public void init(){
        System.out.println("这是notepad初始化方法");
    }

    public void destroy(){
        System.out.println("notepad资源释放");
    }
}
