package com.hzcedu.demo.dao.impl;

import com.hzcedu.demo.dao.UserDao;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

/**
 * @ClassName UserDaoNormal
 * @Description 数据访问层
 * @Author hzc
 * @Date 2020/4/22 17:59
 * @Version 1.0
 */

//@Component
@Repository
public class UserDaoNormal implements UserDao {
    @Override
    public void add() {
        System.out.println("添加用户到数据库中");
    }
}
