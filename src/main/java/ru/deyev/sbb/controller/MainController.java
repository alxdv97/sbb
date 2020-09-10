package ru.deyev.sbb.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;
import ru.deyev.sbb.entity.User;
import ru.deyev.sbb.service.UserService;

import java.util.List;

@RestController
@RequestMapping("/")
public class MainController {

    @Autowired
    UserService userService;


    @GetMapping("/index")
    public String indexPage(){
        return "index";
    }

    @GetMapping("users")
    public List<User> getUsers(){
        return userService.getAllUsers();
    }

//    @GetMapping
//    public ModelAndView mainPage(){
//        ModelAndView modelAndView = new ModelAndView("mainPage");
//        return modelAndView;
//    }

}
