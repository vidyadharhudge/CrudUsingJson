package com.example.crudusingjson.repository;

import com.example.crudusingjson.model.User;
import org.springframework.stereotype.Repository;

import java.io.IOException;
import java.util.List;

@Repository
public interface IUserRepository {
    List<User> getAll();
    void addUser(User user) throws IOException;
    User getById(Integer id);
}
