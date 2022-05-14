package com.demo.todo.dto;

public record PutTodoDTO(
        String title,
        String description,
        Boolean completed
) {
}
