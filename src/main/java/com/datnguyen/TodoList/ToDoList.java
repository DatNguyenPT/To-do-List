package com.datnguyen.TodoList;

import org.springframework.validation.annotation.Validated;

import java.util.List;
import java.util.Optional;

@org.springframework.stereotype.Service
public class ToDoList {
    private List<ToDoItem> list;
    public ToDoList(List<ToDoItem>list){
        this.list = list;
    }

    public List<ToDoItem> getList() {
        return list;
    }

    public void setList(List<ToDoItem> list) {
        this.list = list;
    }
}
