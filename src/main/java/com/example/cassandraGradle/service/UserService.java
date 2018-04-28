package com.example.cassandraGradle.service;

import com.example.cassandraGradle.model.User;
import com.example.cassandraGradle.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserService{

    @Autowired
    private UserRepository userRepository;

    public void insert(User user){
        userRepository.save(user);
    }

    public Optional<User> findByUsername(String username){
        return userRepository.findById(username);
    }

    public User findByUsernameEqualsAndAndPassword(String username, String password) {
        return userRepository.findByUsernameAndPassword(username,password);
    }
}
