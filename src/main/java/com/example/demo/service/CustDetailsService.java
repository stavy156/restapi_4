package com.example.demo.service;

import com.example.demo.entity.CustDetails;
import com.example.demo.repository.CustDetailsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CustDetailsService {

    @Autowired
    private CustDetailsRepository custDetailsRepository;

    public List<CustDetails> getAllCustDetails() {
        return custDetailsRepository.findAll();
    }

    public Optional<CustDetails> getCustDetailsById(Long id) {
        return custDetailsRepository.findById(id);
    }

    public CustDetails createCustDetails(CustDetails custDetails) {
        return custDetailsRepository.save(custDetails);
    }

    public CustDetails updateCustDetails(Long id, CustDetails custDetails) {
        custDetails.setCstId(id);
        return custDetailsRepository.save(custDetails);
    }

    public void deleteCustDetails(Long id) {
        custDetailsRepository.deleteById(id);
    }
}
