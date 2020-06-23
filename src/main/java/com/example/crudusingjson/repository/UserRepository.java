package com.example.crudusingjson.repository;

import com.example.crudusingjson.model.User;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.stereotype.Repository;
import java.io.*;
import java.util.List;

@Repository
public class UserRepository implements IUserRepository {
    private List<User>userList;
    private InputStream inputStream;
    private ObjectMapper objectMapper;

    public UserRepository(){
        objectMapper=new ObjectMapper();
        try {
            inputStream=new FileInputStream(new File("./src/main/resources/JSONData/UserDetails.json"));
            TypeReference<List<User>>typeReference=new TypeReference<List<User>>() {
            };
            userList=objectMapper.readValue(inputStream,typeReference);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (JsonParseException e) {
            e.printStackTrace();
        } catch (JsonMappingException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public List<User> getAll() {
        return userList;
    }

    @Override
    public User addUser(User user) throws IOException {
       userList.add(user);
       objectMapper.writeValue(new File("./src/main/resources/JSONData/UserDetails.json"),userList);
       return user;
    }

    @Override
    public User getById(Integer id) {
       for (User u:userList){
           if (u.getId()==id){
               return u;
           }
       }
        return null;
    }
}
