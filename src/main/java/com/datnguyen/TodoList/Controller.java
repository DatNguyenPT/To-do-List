package com.datnguyen.TodoList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

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
    @RequestMapping("/update")
    public String updateTodo(@ModelAttribute ToDoList requestItems) {
        for (ToDoItem requestItem : requestItems.getList()) {
            ToDoItem item = new ToDoItem(requestItem.getCategory(), requestItem.getName());
            item.setComplete(requestItem.isComplete());
            item.setId(requestItem.getId());
            jpaRepo.save(item);
        }
        return "redirect:/";
    }
}
