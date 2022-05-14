package com.demo.todo.dto;

public record TodoDTO (
        Long id,
        String title,
        String description
) {
}
