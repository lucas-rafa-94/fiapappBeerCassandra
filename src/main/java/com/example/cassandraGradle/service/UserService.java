package com.example.cassandraGradle.service;

import com.example.cassandraGradle.model.User;
import com.example.cassandraGradle.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService{

    @Autowired
    private UserRepository userRepository;

    public void insert(User user){
        userRepository.save(user);
    }

    public User findByEmail(String email){
        return userRepository.findByEmail(email);
    }

    public User findByEmailEqualsAndAndPassword(String email, String password) {
        return userRepository.findByEmailEqualsAndAndPassword(email,password);
    }
}
