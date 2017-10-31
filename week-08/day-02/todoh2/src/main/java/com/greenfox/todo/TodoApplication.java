package com.greenfox.todo;

import com.greenfox.todo.model.ToDo;
import com.greenfox.todo.repository.ToDoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TodoApplication implements CommandLineRunner {

	@Autowired
	ToDoRepository toDoRepository;

	public static void main(String[] args)  {
		SpringApplication.run(TodoApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		toDoRepository.save(new ToDo("I have to learn Object Relational Mapping"));
	}
}
