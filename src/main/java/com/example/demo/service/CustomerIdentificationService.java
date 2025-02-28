package com.example.demo.service;

import com.example.demo.entity.CustomerIdentification;
import com.example.demo.repository.CustomerIdentificationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class CustomerIdentificationService {

    @Autowired
    private CustomerIdentificationRepository repository;

    public List<CustomerIdentification> getAllCustomerIdentifications() {
        return repository.findAll();
    }

    public CustomerIdentification saveCustomerIdentification(CustomerIdentification customerIdentification) {
        return repository.save(customerIdentification);
    }
}
