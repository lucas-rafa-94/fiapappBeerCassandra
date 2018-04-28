package com.example.cassandraGradle.repository;

import com.example.cassandraGradle.model.User;
import org.springframework.data.cassandra.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends CrudRepository<User,String>{
    @Query("SELECT * FROM users WHERE username=?0 and password=?1 ALLOW FILTERING")
    User findByUsernameAndPassword(String username, String password);
}
