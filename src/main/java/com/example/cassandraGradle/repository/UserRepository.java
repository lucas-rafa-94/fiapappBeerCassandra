package com.example.cassandraGradle.repository;

import com.example.cassandraGradle.model.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends CrudRepository<User,String>{
    User findByEmailEqualsAndAndPassword(String email, String password);
    User findByEmail(String email);
}
