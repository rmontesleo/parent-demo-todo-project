package com.demo.todo.service;


import com.demo.todo.dto.PostTodoDTO;
import com.demo.todo.dto.TodoDTO;
import com.demo.todo.model.Todo;
import com.demo.todo.repository.TodoRepository;

import java.util.Arrays;
import java.util.List;

public class TodoService {

    private final TodoRepository repository = new TodoRepository();

    public TodoDTO createTodo( final PostTodoDTO postTodoDTO){


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

    public List<TodoDTO> getAllTodos(){
        //return repository.findAll();
        return Arrays.asList();
    }



}
