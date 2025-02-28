package com.example.demo.service;

import com.example.demo.entity.CustomerProofOfId;
import com.example.demo.repository.CustomerProofOfIdRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerProofOfIdService {

    private final CustomerProofOfIdRepository repository;

    @Autowired
    public CustomerProofOfIdService(CustomerProofOfIdRepository repository) {
        this.repository = repository;
    }

    public List<CustomerProofOfId> getAllProofs() {
        return repository.findAll();
    }
}
