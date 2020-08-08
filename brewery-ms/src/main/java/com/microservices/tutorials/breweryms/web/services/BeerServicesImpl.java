package com.microservices.tutorials.breweryms.web.services;

import java.util.UUID;

import com.microservices.tutorials.breweryms.web.model.BeerDTO;

import org.springframework.stereotype.Service;

@Service
public class BeerServicesImpl implements BeerServices {

    @Override
    public BeerDTO getBeerById(UUID beerId) {
        return BeerDTO.builder().id(beerId)
        .beerName("Galaxy Cat")
        .beerStyle("Pale Ale")
        .build();
    }
    
}