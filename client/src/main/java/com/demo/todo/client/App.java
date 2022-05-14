package com.demo.todo.client;

import com.demo.todo.controller.TodoController;
import com.demo.todo.dto.PostTodoDTO;
import com.demo.todo.dto.TodoDTO;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) {

        System.out.println( "Hello World!" );
        TodoController controller = new TodoController();
        PostTodoDTO todo = new PostTodoDTO( "First todo", "using just JSE" );
        System.out.println( "the todo is " + todo );

        TodoDTO newTodo = controller.postTodo( todo );
        System.out.println("The new todo is " + newTodo );

        System.out.println("Ending..");
    }
}
