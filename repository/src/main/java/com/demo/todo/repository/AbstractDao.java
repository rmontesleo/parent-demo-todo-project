package com.demo.todo.repository;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

public abstract class AbstractDao<I,K> {

    private static final String URL = "jdbc:postgresql://localhost/todoappdb";
    private static final String USER = "postgres_user";
    private static final String PASSWORD = "SuperSecret";

    public Connection getConnection(){
        try{
            Connection connection = DriverManager.getConnection( URL, USER, PASSWORD );
            return  connection;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }


    public void releaseResources( ResultSet resultSet) {
        if( resultSet !=null ){
            try {
                resultSet.close();
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
        }
    }

    public abstract I save( I newItem );

    public  abstract List<I> findAll();

}
