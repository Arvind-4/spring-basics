package com.example.todoapp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController()
@RequestMapping(value = "/api/v1/todos")
@CrossOrigin(origins = "*")
public class TodoController {
    @Autowired
    private TodoService todoService;


    @GetMapping()
    public ResponseEntity<List<Todo>> getAllTodoList() {
        return new ResponseEntity<>(this.todoService.todoList(), HttpStatus.OK);
    }

    @PostMapping(value = "/create")
    public ResponseEntity<?> createTodoList(@RequestBody Todo todo) {
        try {
            return new ResponseEntity<Todo>(this.todoService.createTodo(todo), HttpStatus.CREATED);
        } catch (Exception e) {
            String error = e.getMessage();
            return new ResponseEntity<String>(error, HttpStatus.BAD_REQUEST);
        }
    }
}
