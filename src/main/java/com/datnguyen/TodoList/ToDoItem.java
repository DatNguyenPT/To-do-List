package com.datnguyen.TodoList;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class ToDoItem {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String category;
    private String name;
    private boolean complete;
    public ToDoItem(){}
    public ToDoItem(String category, String name){
        this.category = category;
        this.name = name;
    }
    @Override
    public String toString() {
        return String.format(
                "TodoItem[id=%d, category='%s', name='%s', complete='%b']",
                id, category, name, complete);
    }

    public long getId() {
        return id;
    }

    public String getCategory() {
        return category;
    }

    public String getName() {
        return name;
    }

    public boolean isComplete() {
        return complete;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setComplete(boolean complete) {
        this.complete = complete;
    }
}
