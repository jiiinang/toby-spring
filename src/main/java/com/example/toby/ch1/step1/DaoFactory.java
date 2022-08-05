package com.example.toby.ch1.step1;

public class DaoFactory {

    public UserDao userDao(){
        return new UserDao(getConnectionMaker());
    }

    private DConnectionMaker getConnectionMaker() {
        return new DConnectionMaker();
    }

}
