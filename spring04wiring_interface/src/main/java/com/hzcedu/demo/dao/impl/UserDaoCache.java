package com.hzcedu.demo.dao.impl;

import com.hzcedu.demo.dao.UserDao;

/**
 * @ClassName UserDaoCache
 * @Description TODO
 * @Author hzc
 * @Date 2020/4/23 17:01
 * @Version 1.0
 */
public class UserDaoCache implements UserDao {
    @Override
    public void add() {
        System.out.println("添加用户到缓存中");
    }
}
