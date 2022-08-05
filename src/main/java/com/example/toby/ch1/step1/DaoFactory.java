package com.example.toby.ch1.step1;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DaoFactory {

    @Bean
    public UserDao userDao(){
        return new UserDao(getConnectionMaker());
    }

    @Bean
    public DConnectionMaker getConnectionMaker() {
        return new DConnectionMaker();
    }

}
