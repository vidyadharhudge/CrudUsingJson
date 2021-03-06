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

    @PostMapping("/add")
    public User addUser(@RequestBody User user) throws IOException {
        return userService.addUser(user);
    }

    @PutMapping("/{id}")
    public User update(@RequestBody User user,@PathVariable Integer id) throws IOException {
        User user1=userService.getById(id);
        user1.setFirstName(user.getFirstName());
        user1.setLastName(user.getLastName());
        user1.setNumber(user.getNumber());
        return userService.addUser(user1);
    }

    @GetMapping("/{id}")
    public User getById(@PathVariable Integer id){
        return userService.getById(id);
    }

    @DeleteMapping("/{id}")
    public void deleteById(@PathVariable Integer id){
        userService.deleteById(id);
    }
}
