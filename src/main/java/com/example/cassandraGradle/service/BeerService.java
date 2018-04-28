package com.example.cassandraGradle.service;

import com.example.cassandraGradle.model.Beer;
import com.example.cassandraGradle.repository.BeersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BeerService {
    @Autowired
    private BeersRepository beersRepository;

    public void insert(Beer beer){
        beersRepository.save(beer);
    }

    public List<Beer> findAll(){
        return (List<Beer>) beersRepository.findAll();
    }

    public List<Beer> findByMarca(String marca){
        return beersRepository.findByMarca(marca);
    }
}