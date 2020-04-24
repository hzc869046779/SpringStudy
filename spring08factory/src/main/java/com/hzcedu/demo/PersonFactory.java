package com.hzcedu.demo;

/**
 * @ClassName PersonFactory
 * @Description TODO
 * @Author hzc
 * @Date 2020/4/24 18:44
 * @Version 1.0
 */
public class PersonFactory {

    /**
     * 静态工厂方法
     * @return
     */
    public static Person createPerson(){
        System.out.println("静态工厂创建Person");
        return new Person();
    }


    /**
     * 实例工厂方法
     */

    public Person createPerson2(){
        System.out.println("实例工厂");
        return new Person();
    }
}
