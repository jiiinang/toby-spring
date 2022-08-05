package com.example.toby.ch1.step1;

import java.sql.Connection;
import java.sql.SQLException;

public class CountingConnectionMaker implements ConnectionMaker{

    int count = 0;
    ConnectionMaker realConnectionMaker;

    public CountingConnectionMaker(ConnectionMaker realConnectionMaker) {
        this.realConnectionMaker = realConnectionMaker;
    }

    @Override
    public Connection makeConnection() throws ClassNotFoundException, SQLException {
        count++;
        return realConnectionMaker.makeConnection();
    }

    public int getCount() {
        return count;
    }
}
