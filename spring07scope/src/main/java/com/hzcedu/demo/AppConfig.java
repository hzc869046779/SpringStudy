package com.hzcedu.demo;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

/**
 * @ClassName AppConfig
 * @Description TODO
 * @Author hzc
 * @Date 2020/4/24 18:27
 * @Version 1.0
 */

@Configuration
@ComponentScan
public class AppConfig {

    @Bean
    @Scope(ConfigurableBeanFactory.SCOPE_SINGLETON)
    public Notepad3 notepad3(){
        return new Notepad3();
    }
}
