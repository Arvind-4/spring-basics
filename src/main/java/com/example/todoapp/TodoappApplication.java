package com.example.todoapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RestController;


@SpringBootApplication
@RestController
public class TodoappApplication {
    public static void main(String[] args) {
        SpringApplication.run(TodoappApplication.class, args);
    }

}
