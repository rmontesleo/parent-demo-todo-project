package com.demo.todo.controller;

import com.demo.todo.dto.PostTodoDTO;
import com.demo.todo.dto.TodoDTO;
import com.demo.todo.service.TodoService;

import java.util.List;

public class TodoController {

    private final TodoService service = new TodoService();


    public TodoDTO postTodo(final PostTodoDTO todo){
        TodoDTO newTodo = service.createTodo(todo);
        return newTodo;
    }

    public List<TodoDTO> fetchAllTodos(){
        return service.getAllTodos();
    }

}
