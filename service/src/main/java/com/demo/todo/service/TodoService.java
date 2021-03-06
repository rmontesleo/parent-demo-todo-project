package com.demo.todo.service;


import com.demo.todo.dto.PostTodoDTO;
import com.demo.todo.dto.TodoDTO;
import com.demo.todo.model.Todo;
import com.demo.todo.repository.TodoRepository;


import java.util.List;
import java.util.stream.Collectors;

public class TodoService {

    private final TodoRepository repository = new TodoRepository();

    public TodoDTO createTodo( final PostTodoDTO postTodoDTO){

        Todo todo = Todo.builder()
                        .title( postTodoDTO.title() )
                        .description( postTodoDTO.description() )
                        .build();
        repository.save( todo );

        TodoDTO newTodo = new TodoDTO(
                todo.getTodoId(),
                todo.getTitle(),
                todo.getDescription()
        );

        return newTodo;
    }

    public List<TodoDTO> getAllTodos(){
        return repository.findAll().stream()
                .map( todo ->{
                    TodoDTO dto = new TodoDTO(
                            todo.getTodoId(),
                            todo.getTitle(),
                            todo.getDescription()
                            );
                    return dto;
                }).collect( Collectors.toList() );

    }

}
