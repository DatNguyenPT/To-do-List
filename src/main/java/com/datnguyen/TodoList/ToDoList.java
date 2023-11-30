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

    public void add(ToDoItem item){
        list.add(item);
    }

    public void delete(String name){
        int index = 0;
        for (ToDoItem item : list){
            if (item.getName().equals(name)){
                index = list.indexOf(item);
                break;
            }
        }
        list.remove(index);
    }

    public ToDoItem getItem(String name){
        int index = 0;
        for (ToDoItem item : list){
            if (item.getName().equals(name)){
                index = list.indexOf(item);
                break;
            }
        }
        return list.get(index);
    }
}
