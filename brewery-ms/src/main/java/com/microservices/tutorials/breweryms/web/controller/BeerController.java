package com.microservices.tutorials.breweryms.web.controller;

import java.util.UUID;

import com.microservices.tutorials.breweryms.web.model.BeerDTO;
import com.microservices.tutorials.breweryms.web.services.BeerServices;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/beer")
public class BeerController {

    private final BeerServices beerService;

    public BeerController(BeerServices beerService){
        this.beerService = beerService;
    }

    @GetMapping({"/{beerId}"})
    public ResponseEntity<BeerDTO> getBeer(@PathVariable("beerId") UUID beerId){

        return new ResponseEntity<>(beerService.getBeerById(beerId), HttpStatus.OK);
    }
    
}