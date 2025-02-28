package com.example.demo.controller;

import com.example.demo.entity.CustomerIdentification;
import com.example.demo.service.CustomerIdentificationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/customer-identification")
public class CustomerIdentificationController {

    @Autowired
    private CustomerIdentificationService service;

    @GetMapping
    public List<CustomerIdentification> getAllCustomerIdentifications() {
        return service.getAllCustomerIdentifications();
    }

    @PostMapping
    public CustomerIdentification saveCustomerIdentification(@RequestBody CustomerIdentification customerIdentification) {
        return service.saveCustomerIdentification(customerIdentification);
    }
}
