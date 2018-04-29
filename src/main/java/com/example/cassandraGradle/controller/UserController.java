package com.example.cassandraGradle.controller;

import com.example.cassandraGradle.model.User;
import com.example.cassandraGradle.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    private UserService service;

    @PostMapping("/insert")
    public void insert(@RequestBody User user){
            service.insert(user);
    }

    @GetMapping("/find/{email}")
    public User findByEmail(@PathVariable(value="email") String email){
        return service.findByEmail(email);
    }

    @GetMapping("/find")
    public User findByUsernameAndPassword(@RequestParam String email, @RequestParam String password){
        return service.findByEmailEqualsAndAndPassword(email,password);
    }

}
