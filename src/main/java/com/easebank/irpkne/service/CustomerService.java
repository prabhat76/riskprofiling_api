package com.easebank.irpkne.service;


import com.easebank.irpkne.model.customerData;
import com.easebank.irpkne.repository.customerRepository; // Import your repository
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CustomerService {

    @Autowired
    private customerRepository customerRepository; // Use proper casing

    public List<customerData> getAllCustomers() {
        return customerRepository.findAll();
    }

    public Optional<customerData> getCustomerById(Long id) {
        return customerRepository.findById(id);
    }

    public customerData saveCustomer(customerData customer) {
        return customerRepository.save(customer); // Fixed incorrect variable name
    }

    public void deleteCustomer(Long id) {
        customerRepository.deleteById(id);
    }
}
