package com.example.crudusingjson.service;

import com.example.crudusingjson.model.User;
import com.example.crudusingjson.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.util.List;

@Service
public class UserService{


    @Autowired
    private UserRepository userRepository;


    public List<User>getAll(){
        List<User>userList=userRepository.getAll();
        return userList;
    }

    public void addUser(User user) throws IOException {
       userRepository.addUser(user);

    }

    public User getById(Integer id){
         return userRepository.getById(id);
    }
}
