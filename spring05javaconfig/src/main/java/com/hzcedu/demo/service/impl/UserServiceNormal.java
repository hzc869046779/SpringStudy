package com.hzcedu.demo.service.impl;

import com.hzcedu.demo.dao.UserDao;
import com.hzcedu.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

/**
 * @ClassName UserServiceNormal
 * @Description 业务层
 * @Author hzc
 * @Date 2020/4/22 15:05
 * @Version 1.0
 */


public class UserServiceNormal implements UserService {

    private UserDao userDao;

    public UserServiceNormal() {
        super();
    }

    public UserServiceNormal(UserDao userDao) {
        this.userDao = userDao;
    }

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    @Override
    public void add() {
        userDao.add();
    }
}
