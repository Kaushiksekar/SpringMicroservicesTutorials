package com.microservices.tutorials.breweryms.web.services;

import java.util.UUID;

import com.microservices.tutorials.breweryms.web.model.CustomerDTO;

import org.springframework.stereotype.Service;

@Service
public class CustomerServicesImpl implements CustomerServices {

    @Override
    public CustomerDTO getCustomerById(UUID customerId) {
        return CustomerDTO.builder().id(customerId).name("Kaushik").build();
    }
    
}