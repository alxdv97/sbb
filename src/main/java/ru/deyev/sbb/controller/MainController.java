package ru.deyev.sbb.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;
import ru.deyev.sbb.entity.Station;
import ru.deyev.sbb.entity.User;
import ru.deyev.sbb.service.StationService;
import ru.deyev.sbb.service.UserService;

import java.util.List;

@Controller
@RequestMapping("/")
public class MainController {

    @Autowired
    UserService userService;

    @Autowired
    StationService stationService;


    @GetMapping("/index")
    public String indexPage(){
        return "index";
    }

    @GetMapping("users")
    public List<User> getUsers(){
        return userService.getAllUsers();
    }

    @GetMapping("stations")
    public List<Station> getStations(){
        return stationService.getAllStations();
    }

    @GetMapping
    public String mainPage(){
        return "mainPage";
    }

}
