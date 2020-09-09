package ru.deyev.sbb.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import ru.deyev.sbb.entity.User;
import ru.deyev.sbb.service.UserService;

import java.util.List;

@Controller
@RequestMapping("/")
public class MainController {

    @Autowired
    UserService userService;


    @GetMapping("/index")
    public String mainPage(){
        return "index";
    }

    @GetMapping("/users")
    public ResponseEntity<List<User>> getUsers(){
        return ResponseEntity.ok(userService.getAllUsers());
    }


}
