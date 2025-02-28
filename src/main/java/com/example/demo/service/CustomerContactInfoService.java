package com.example.demo.service;

import com.example.demo.entity.CustomerContactInfo;
import com.example.demo.repository.CustomerContactInfoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerContactInfoService {

    @Autowired
    private CustomerContactInfoRepository repository;

    public List<CustomerContactInfo> getAllContacts() {
        return repository.findAll();
    }

    public CustomerContactInfo saveContact(CustomerContactInfo contact) {
        return repository.save(contact);
    }
}
