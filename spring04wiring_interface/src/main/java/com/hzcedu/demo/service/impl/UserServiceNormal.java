package com.hzcedu.demo.service.impl;

import com.hzcedu.demo.dao.UserDao;
import com.hzcedu.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

/**
 * @ClassName UserServiceNormal
 * @Description 业务层
 * @Author hzc
 * @Date 2020/4/22 15:05
 * @Version 1.0
 */

//@Component
@Service
@Qualifier("normal")
public class UserServiceNormal implements UserService {

    @Autowired
    private UserDao userDao;

    @Override
    public void add() {
        userDao.add();
    }
}
