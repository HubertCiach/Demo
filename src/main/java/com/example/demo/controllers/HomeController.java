package com.example.demo.controllers;

import com.example.demo.services.ToDoItemService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {

    private ToDoItemService toDoItemService;

    public HomeController(ToDoItemService toDoItemService) {
        this.toDoItemService = toDoItemService;
    }

    @GetMapping("/")
    public ModelAndView index() {
        ModelAndView modelAndView = new ModelAndView("index");
        modelAndView.addObject("toDoItems", toDoItemService.getAll());
        return modelAndView;
    }
}
