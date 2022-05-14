package com.demo.todo.controller;

import com.demo.todo.dto.PostTodoDTO;
import com.demo.todo.dto.TodoDTO;
import com.demo.todo.service.TodoService;

public class TodoController {
    public TodoDTO postTodo(PostTodoDTO todo){
        TodoService service = new TodoService();
        TodoDTO newTodo = service.createTodo(todo);
        return newTodo;
    }
}
