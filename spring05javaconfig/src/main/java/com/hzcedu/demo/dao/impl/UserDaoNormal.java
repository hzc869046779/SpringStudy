package com.hzcedu.demo.dao.impl;

import com.hzcedu.demo.dao.UserDao;

import java.net.URLStreamHandlerFactory;

/**
 * @ClassName UserDaoNormal
 * @Description TODO
 * @Author hzc
 * @Date 2020/4/23 16:27
 * @Version 1.0
 */
public class UserDaoNormal implements UserDao {

    public void add() {
        System.out.println("添加用户到数据库中");
    }
}
