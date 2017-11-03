package com.greenfox.todo;

import com.greenfox.todo.repository.ToDoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.thymeleaf.extras.java8time.dialect.Java8TimeDialect;

@SpringBootApplication
public class TodoApplication implements CommandLineRunner {

	@Autowired
	ToDoRepository toDoRepository;


	public static void main(String[] args)  {
		SpringApplication.run(TodoApplication.class, args);
	}


	@Override
	public void run(String... args) throws Exception {
	}
}
