package com.example.demo.controller;

import com.example.demo.entity.CustomerProofOfId;
import com.example.demo.service.CustomerProofOfIdService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/customer-proof")
public class CustomerProofOfIdController {

    private final CustomerProofOfIdService service;

    @Autowired
    public CustomerProofOfIdController(CustomerProofOfIdService service) {
        this.service = service;
    }

    @GetMapping
    public ResponseEntity<List<CustomerProofOfId>> getAllProofs() {
        return ResponseEntity.ok(service.getAllProofs());
    }
}
