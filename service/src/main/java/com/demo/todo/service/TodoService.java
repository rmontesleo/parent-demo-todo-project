package com.demo.todo.service;


import com.demo.todo.dto.PostTodoDTO;
import com.demo.todo.dto.TodoDTO;
import com.demo.todo.model.Todo;
import com.demo.todo.repository.TodoRepository;

public class TodoService {

    public TodoDTO createTodo( PostTodoDTO postTodoDTO){

        TodoRepository repository = new TodoRepository();
        Todo todo = new Todo();
        todo.setTitle(postTodoDTO.title() );
        todo.setDescription( postTodoDTO.description() );
        repository.save( todo );

        TodoDTO newTodo = new TodoDTO(
                todo.getTodoId(),
                todo.getTitle(),
                todo.getDescription()
        );

        return newTodo;
    }



}
