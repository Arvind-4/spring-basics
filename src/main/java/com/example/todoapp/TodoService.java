package com.example.todoapp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TodoService {
    @Autowired
    private TodoRepository todoRepository;

    public List<Todo> todoList() {
        return todoRepository.findAll();
    }

    public Todo createTodo(Todo todo) {
        try {
            if (todo.getTitle() == null || todo.getTitle().isEmpty()) {
                throw new RuntimeException("Title is required");
            }
            if (todo.getDescription() == null || todo.getDescription().isEmpty()) {
                throw new RuntimeException("Description is required");
            }
            return todoRepository.insert(todo);
        } catch (Exception e) {
            String error = e.getMessage();
            throw new RuntimeException(error);
        }

    }
}
