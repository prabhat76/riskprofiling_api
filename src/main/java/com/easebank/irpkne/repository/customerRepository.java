package com.easebank.irpkne.repository;

import com.easebank.irpkne.model.customerData;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


import java.util.Optional;

@Repository
public interface customerRepository extends JpaRepository<customerData, Long> {
    Optional<customerData> findByUsername(String username);
}
