package com.example.toby.ch1.step1;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import javax.sql.DataSource;

@Configuration
public class CountingDaoFactory {

    @Bean
    public UserDao userDao(){
        return new UserDao(dataSource());
    }

    @Bean
    public ConnectionMaker connectionMaker(){
        return new CountingConnectionMaker(getConnectionMaker());
    }

    @Bean
    public ConnectionMaker getConnectionMaker() {
        return new DConnectionMaker();
    }

    @Bean
    public DataSource dataSource(){
        DriverManagerDataSource dataSource = new DriverManagerDataSource();

        //dataSource.setDriverClass(com.mysql.cj.jdbc.Driver.class);
        dataSource.setUrl("jdbc:mysql://localhost/tobyspring?characterEncoding=UTF-8");
        dataSource.setUsername("root");
        dataSource.setPassword("chl2425!");

        return dataSource;
    }
}
