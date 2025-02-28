package com.example.demo.controller;

import com.example.demo.entity.CustomerContactInfo;
import com.example.demo.service.CustomerContactInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/customer-contact")
public class CustomerContactInfoController {

    @Autowired
    private CustomerContactInfoService service;

    @GetMapping
    public List<CustomerContactInfo> getAllContacts() {
        return service.getAllContacts();
    }

    @PostMapping
    public CustomerContactInfo createContact(@RequestBody CustomerContactInfo contact) {
        return service.saveContact(contact);
    }
}
