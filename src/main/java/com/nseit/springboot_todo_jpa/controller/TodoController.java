package com.nseit.springboot_todo_jpa.controller;

import com.nseit.springboot_todo_jpa.model.Todo;
import com.nseit.springboot_todo_jpa.service.TodoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/todo")
public class TodoController {

    @Autowired
    private TodoService todoService;

    @PostMapping
    public void addTodo(Todo todo) {
        todoService.addTodo(todo);
    }

    @GetMapping("/all")
    public List<Todo> viewTodo() {
        return todoService.viewTodo();
    }

    @PutMapping
    public void updateTodo(Todo todo) {
        todoService.updateTodo(todo);

    }

    @DeleteMapping("/{id}")
    public void deleteTodo(@PathVariable int id) {
        todoService.deleteTodo(id);
    }
}
