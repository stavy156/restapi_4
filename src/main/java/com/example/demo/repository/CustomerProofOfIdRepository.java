package com.example.demo.repository;

import com.example.demo.entity.CustomerProofOfId;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerProofOfIdRepository extends JpaRepository<CustomerProofOfId, Long> {
}
