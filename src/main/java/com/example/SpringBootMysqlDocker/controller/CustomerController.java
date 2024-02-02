package com.example.SpringBootMysqlDocker.controller;

import com.example.SpringBootMysqlDocker.entity.Customer;
import com.example.SpringBootMysqlDocker.repo.CustomerRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class CustomerController {

    private final CustomerRepo customerRepo;

    @Autowired
    public CustomerController(CustomerRepo customerRepo) {
        this.customerRepo = customerRepo;
    }

    @GetMapping("/customers")
    public List<Customer> getAllCustomer(){
        return customerRepo.findAll();
    }

    @PostMapping("/customers")
    public Customer getAllCustomer(@RequestBody Customer customer){
        return customerRepo.save(customer);
    }
}
