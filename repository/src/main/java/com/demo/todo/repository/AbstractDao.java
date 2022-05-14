package com.demo.todo.repository;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.List;
import java.util.Optional;

public abstract class AbstractDao<I,K> {

    private static final String URL = "jdbc:postgresql://localhost/todoappdb";
    private static final String USER = "postgres_user";
    private static final String PASSWORD = "SuperSecret";

    public Connection getConnection(){
        try{
            Connection connection = DriverManager.getConnection( URL, USER, PASSWORD );
            System.out.println("Connection is "+ connection  );
            return  connection;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public void releaseConnection( Connection connection ){
        //connection.map( connection1 -> )
    }

    public abstract I save( I newItem );

    public  abstract List<I> findAll();

}
