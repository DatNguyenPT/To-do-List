package com.datnguyen.TodoList;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@org.springframework.stereotype.Controller
public class Controller {
    @Autowired
    private JPARepo jpaRepo;

    @GetMapping(value = "/")
    public String index(Model model) {
        List<ToDoItem> list = (List<ToDoItem>) jpaRepo.findAll();
        model.addAttribute("newitem", new ToDoItem());
        model.addAttribute("items", new ToDoList(list));
        return "index";
    }

    @PostMapping(value = "add")
    public String addTodo(@ModelAttribute ToDoItem requestItem) {
        ToDoItem item = new ToDoItem(requestItem.getCategory(), requestItem.getName());
        jpaRepo.save(item);
        return "redirect:/";
    }
    @PostMapping(value = "/delete/{name}")
    public String deleteTask(@PathVariable String name) {
        jpaRepo.deleteByName(name);
        return "redirect:/";
    }
}
