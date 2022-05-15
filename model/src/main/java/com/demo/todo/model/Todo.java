package com.demo.todo.model;

import lombok.*;

@Getter
@Setter
@ToString
@RequiredArgsConstructor
@AllArgsConstructor
@Builder
public class Todo {
    private Long todoId;
    private String title;
    private String description;
}
