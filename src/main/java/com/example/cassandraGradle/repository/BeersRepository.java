package com.example.cassandraGradle.repository;

import com.example.cassandraGradle.model.Beer;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BeersRepository extends CrudRepository<Beer,String >{
    List<Beer> findByMarca(String marca);
}
