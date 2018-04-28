package com.example.cassandraGradle.controller;

import com.example.cassandraGradle.model.User;
import com.example.cassandraGradle.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    private UserService service;

    @RequestMapping(value = "/insert", method = RequestMethod.POST)
    public void insert(@RequestBody User user){
            service.insert(user);
    }

    @RequestMapping(value = "/find/{username}", method = RequestMethod.GET)
    public Optional<User> findByUsername(@PathVariable(value="username") String username){
        return service.findByUsername(username);
    }

    @RequestMapping(value = "/find", method = RequestMethod.GET)
    public User findByUsernameAndPassword(@RequestParam String username, @RequestParam String password){
        return service.findByUsernameEqualsAndAndPassword(username,password);
    }


}
