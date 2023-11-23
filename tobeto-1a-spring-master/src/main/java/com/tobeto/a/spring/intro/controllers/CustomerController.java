package com.tobeto.a.spring.intro.controllers;

import com.tobeto.a.spring.intro.entities.Customer;
import com.tobeto.a.spring.intro.repositories.CustomerRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/customers")
public class CustomerController {

    private final CustomerRepository customerRepository;


    public CustomerController(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }
    @GetMapping
    public List<Customer> getAll() {
        List<Customer> customers = customerRepository.findAll();
        return customers;
    }

    @GetMapping("{id}")
    public Customer getById(@PathVariable int id) {
        return customerRepository.findById(id).orElseThrow();
    }

    @PostMapping
    public void add(@RequestBody Customer customer) {
        customerRepository.save(customer);
    }

    @DeleteMapping("{id}")
    public void delete(@PathVariable int id) {
        Customer customerToDelete = customerRepository.findById(id).orElseThrow();
        customerRepository.delete(customerToDelete);
    }

    @PutMapping("{id}")
    public void update(@PathVariable int id, @RequestBody Customer customer) {
        Customer customerToUpdate = customerRepository.findById(id).orElseThrow();
        customerToUpdate.setCustomerEmail(customer.getCustomerEmail());
        customerToUpdate.setCustomerPassword(customer.getCustomerPassword());
        customerToUpdate.setId(customer.getId());
        customerToUpdate.setAge(customer.getAge());
        customerToUpdate.setGender(customer.getGender());
        customerToUpdate.setContactAddress(customer.getContactAddress());
        customerToUpdate.setFName(customer.getFName());
        customerToUpdate.setLName(customer.getLName());
        customerRepository.save(customerToUpdate);
    }

}
