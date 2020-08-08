package com.microservices.tutorials.breweryms.web.controller;

import java.util.UUID;

import com.microservices.tutorials.breweryms.web.model.CustomerDTO;
import com.microservices.tutorials.breweryms.web.services.CustomerServices;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/customer")
public class CustomerController {

    @Autowired
    private CustomerServices customerServices;

    @GetMapping("/{customerId}")
    public ResponseEntity<CustomerDTO> getCustomer(@PathVariable("customerId") UUID customerId){

        return new ResponseEntity<>( customerServices.getCustomerById(customerId), HttpStatus.OK);
    }
    
}