package com.example.toby.ch1.step1;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class CountingDaoFactory {

    @Bean
    public UserDao userDao(){
        return new UserDao(connectionMaker());
    }

    @Bean
    public ConnectionMaker connectionMaker(){
        return new CountingConnectionMaker(getConnectionMaker());
    }

    @Bean
    public ConnectionMaker getConnectionMaker() {
        return new DConnectionMaker();
    }
}
