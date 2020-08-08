package com.microservices.tutorials.breweryms.web.services;

import java.util.UUID;

import com.microservices.tutorials.breweryms.web.model.BeerDTO;

public interface BeerServices {

	public BeerDTO getBeerById(UUID beerId);
    
}