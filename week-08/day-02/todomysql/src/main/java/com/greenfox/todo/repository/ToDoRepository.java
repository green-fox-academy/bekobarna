package com.greenfox.todo.repository;

import com.greenfox.todo.model.ToDo;
import org.springframework.data.repository.CrudRepository;

public interface ToDoRepository extends CrudRepository<ToDo, Integer>{

}
