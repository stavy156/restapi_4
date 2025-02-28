package com.example.demo.repository;
import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entity.CustDetails;

public interface CustDetailsRepository extends JpaRepository<CustDetails, Long>{
}
