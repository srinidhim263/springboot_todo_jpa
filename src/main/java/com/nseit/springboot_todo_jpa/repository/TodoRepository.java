package com.nseit.springboot_todo_jpa.repository;

import com.nseit.springboot_todo_jpa.model.Todo;
import lombok.Getter;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;

@Repository
public interface TodoRepository extends JpaRepository<Todo, Integer> {

}
