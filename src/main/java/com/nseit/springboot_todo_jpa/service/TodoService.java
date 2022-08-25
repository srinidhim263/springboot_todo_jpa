package com.nseit.springboot_todo_jpa.service;

import com.nseit.springboot_todo_jpa.model.Todo;
import com.nseit.springboot_todo_jpa.repository.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TodoService {
    @Autowired
    private TodoRepository todoRepository;

    public void addTodo(Todo todo) {
        todoRepository.save(todo);
    }

    public List<Todo> viewTodo() {
        return todoRepository.findAll();
    }

    public void updateTodo(Todo todo) {
        todoRepository.save(todo);
    }

    public void deleteTodo(int id) {
        for (Todo todo : todoRepository.findAll()) {
            if (id == todo.getId()) {
                todoRepository.delete(todo);
            }
        }
    }
}
