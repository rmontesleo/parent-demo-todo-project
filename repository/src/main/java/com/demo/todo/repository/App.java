package com.demo.todo.repository;

import com.demo.todo.model.Todo;

public class App {

    public static void main(String[] args) {
        TodoRepository repository = new TodoRepository();
        Todo todo = new Todo();
        todo.setTitle("First");
        todo.setDescription("A very long description");
        repository.save(todo);
    }
}
