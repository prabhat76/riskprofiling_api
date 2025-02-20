package com.easebank.irpkne.controller;

import com.easebank.irpkne.model.customerData;
import com.easebank.irpkne.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/customers")
@CrossOrigin(origins = "http://localhost:4200")
public class customerController {
    @Autowired
    private CustomerService customerService;

    @GetMapping
    public List<customerData> getAllCustomers() {
        return customerService.getAllCustomers();
    }

    @GetMapping("/{id}")
    public Optional<customerData> getCustomerById(@PathVariable Long id) {
        return customerService.getCustomerById(id);
    }

    @PostMapping
    public customerData createCustomer(@RequestBody customerData customerData) {
        return customerService.saveCustomer(customerData);
    }

    @DeleteMapping("/{id}")
    public String deleteCustomer(@PathVariable Long id) {
        customerService.deleteCustomer(id);
        return "Customer with ID " + id + " deleted successfully!";
    }
}
