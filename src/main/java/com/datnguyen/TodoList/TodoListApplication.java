package com.datnguyen.TodoList;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;


@SpringBootApplication
@EntityScan(basePackages = {"com.datnguyen.TodoList"})
public class TodoListApplication {
	public static void main(String[] args) {
		SpringApplication.run(TodoListApplication.class, args);
	}
}
