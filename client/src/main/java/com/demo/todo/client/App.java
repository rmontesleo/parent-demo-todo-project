package com.demo.todo.client;

import com.demo.todo.controller.TodoController;
import com.demo.todo.dto.PostTodoDTO;
import com.demo.todo.dto.TodoDTO;

import java.util.List;
import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) {

        Scanner scanner = new Scanner(System.in);

        System.out.println( "Type your the TODO data" );
        TodoController controller = new TodoController();

        System.out.print("Type the title: ");
        final String title = scanner.nextLine();

        System.out.print("Type the description: ");
        final String description = scanner.nextLine();

        PostTodoDTO todo = new PostTodoDTO( title, description);
        System.out.println( "the todo is " + todo );

        TodoDTO newTodo = controller.postTodo( todo );
        System.out.println("The new todo is " + newTodo );

        List<TodoDTO> dtoList = controller.fetchAllTodos();
        dtoList.stream().forEach( System.out::println );

        System.out.println("Ending..");
        scanner.close();
    }
}
