package com.demo.todo.repository;

import com.demo.todo.model.Todo;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class TodoRepository  extends  AbstractDao<Todo,Long> {


    public Todo save( final Todo todo ) {

        final String sqlUpdate = "INSERT INTO todos (title, description) values(?, ?)";
        String generatedColumns[] = { "id" };
        ResultSet resultSet = null;

        try(
                Connection connection = getConnection();
                PreparedStatement statement = connection.prepareStatement(sqlUpdate, generatedColumns);
        ){
            statement.setString(1, todo.getTitle() );
            statement.setString( 2, todo.getDescription() );
            statement.executeUpdate();
            resultSet = statement.getGeneratedKeys();
            if( resultSet.next() ){
                todo.setTodoId( resultSet.getLong(1) );
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }finally {
            releaseResources(resultSet);
        }
        todo.setTodoId(1L);
        return todo;
    }

    public List<Todo> findAll(){
        final String query = "SELECT * FROM todos ";
        final List<Todo> todoList = new ArrayList<>();
        Todo currentTodo = null;

        try(
                Connection connection = getConnection();
                Statement statement = connection.createStatement();
                ResultSet resultSet = statement.executeQuery( query );
        ){
            while ( resultSet.next() ){
                currentTodo = new Todo();
                currentTodo.setTodoId( resultSet.getLong("id") );
                currentTodo.setTitle( resultSet.getString("title") );
                currentTodo.setDescription( resultSet.getString("description") );
                todoList.add(currentTodo);
            }
            return  todoList;

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

}
