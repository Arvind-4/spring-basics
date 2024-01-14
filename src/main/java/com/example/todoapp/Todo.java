package com.example.todoapp;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.databind.ser.std.ToStringSerializer;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.format.annotation.DateTimeFormat;

@Document(collection = "todos")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Todo {
    @Id()
    @JsonSerialize(using = ToStringSerializer.class)
    private ObjectId _id = new ObjectId();
    private String title;
    private String description;
    private boolean completed = false;

    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
    @CreatedDate
    private String createdAt = new java.util.Date().toString();

    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
    @CreatedDate
    private String updatedAt = new java.util.Date().toString();
}
