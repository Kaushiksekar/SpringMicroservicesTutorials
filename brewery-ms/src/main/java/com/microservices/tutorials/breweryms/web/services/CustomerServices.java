package com.microservices.tutorials.breweryms.web.services;

import java.util.UUID;

import com.microservices.tutorials.breweryms.web.model.CustomerDTO;

public interface CustomerServices {

    public CustomerDTO getCustomerById(UUID customerId);
    
}