package com.hzcedu.demo.service.impl;

import com.hzcedu.demo.service.UserService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

/**
 * @ClassName UserServiceFestival
 * @Description TODO
 * @Author hzc
 * @Date 2020/4/22 17:40
 * @Version 1.0
 */

@Component("festival")
//@Primary
//@Qualifier("festival")
public class UserServiceFestival implements UserService {
    @Override
    public void add() {
        System.out.println("注册用户发送优惠券");
    }
}
