package com.demo.todo.repository;

import com.demo.todo.model.Todo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Arrays;
import java.util.List;

public class TodoRepository  extends  AbstractDao<Todo,Long> {


    public Todo save( final Todo todo ) {
        Connection connection = getConnection();
        final String sqlUpdate = "INSERT INTO todos (title, description) values(?, ?)";

        try(PreparedStatement statement = connection.prepareStatement( sqlUpdate)){
            statement.setString(1, todo.getTitle() );
            statement.setString( 2, todo.getDescription() );
            statement.executeUpdate();

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }finally {
            releaseConnection( connection );
        }

        todo.setTodoId(1L);
        return todo;
    }

    public List<Todo> findAll(){
        return Arrays.asList();
    }

}
