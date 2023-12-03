package com.datnguyen.TodoList;

import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;


public interface JPARepo<TodoItem> extends CrudRepository<ToDoItem, Long>{@Transactional
    @Modifying
    @Query("DELETE FROM ToDoItem t WHERE t.name = :name")
    void deleteByName(@Param("name") String name);
}
