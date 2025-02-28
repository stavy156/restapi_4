package com.example.demo.controller;

import com.example.demo.entity.CustDetails;
import com.example.demo.repository.CustDetailsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/cust-details")
public class CustDetailsController {

    @Autowired
    private CustDetailsRepository custDetailsRepository;

    @GetMapping
    public List<CustDetails> getAllCustDetails() {
        return custDetailsRepository.findAll();
    }

    @GetMapping("/{id}")
    public Optional<CustDetails> getCustDetailsById(@PathVariable Long id) {
        return custDetailsRepository.findById(id);
    }

    @PostMapping
    public CustDetails createCustDetails(@RequestBody CustDetails custDetails) {
        return custDetailsRepository.save(custDetails);
    }

    @PutMapping("/{id}")
    public CustDetails updateCustDetails(@PathVariable Long id, @RequestBody CustDetails custDetails) {
        custDetails.setCstId(id);
        return custDetailsRepository.save(custDetails);
    }

    @DeleteMapping("/{id}")
    public void deleteCustDetails(@PathVariable Long id) {
        custDetailsRepository.deleteById(id);
    }
}