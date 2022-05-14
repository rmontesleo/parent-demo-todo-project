package com.demo.todo.repository;

import com.demo.todo.model.Todo;

public class TodoRepository {

    public Todo save( Todo todo ) {
        todo.setTodoId(1L);
        return todo;
    }

}
