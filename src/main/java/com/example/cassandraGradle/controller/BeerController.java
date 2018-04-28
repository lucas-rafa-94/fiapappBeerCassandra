package com.example.cassandraGradle.controller;

import com.example.cassandraGradle.model.Beer;
import com.example.cassandraGradle.service.BeerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/beers")
public class BeerController {

    @Autowired
    private BeerService beerService;

    @RequestMapping(value = "/insert", method = RequestMethod.POST)
    public void insert(@RequestBody Beer beer){
        beerService.insert(beer);
    }

    @RequestMapping(value = "/findAll", method = RequestMethod.GET)
    public List<Beer> findAll(){
        return beerService.findAll();
    }

    @RequestMapping(value = "/find", method = RequestMethod.GET)
    public List<Beer> findByUsernameAndPassword(@RequestParam String marca){
        return beerService.findByMarca(marca);
    }
}
