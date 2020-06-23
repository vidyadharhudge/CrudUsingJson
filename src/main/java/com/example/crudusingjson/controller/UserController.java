package com.example.crudusingjson.controller;
import com.example.crudusingjson.model.User;
import com.example.crudusingjson.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;
import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/information")
    public List<User>userList(){
        return userService.getAll();
    }
}