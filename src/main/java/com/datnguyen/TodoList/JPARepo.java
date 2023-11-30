package com.datnguyen.TodoList;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;


public interface JPARepo<TodoItem> extends CrudRepository<ToDoItem, Long>{

}
