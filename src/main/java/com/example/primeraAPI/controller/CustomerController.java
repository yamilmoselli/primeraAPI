package com.example.primeraAPI.controller;

import com.example.primeraAPI.entities.Customer;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@RestController
public class CustomerController {

    private List<Customer> customerList = new ArrayList<>();

    public CustomerController() {
        Customer c1 = new Customer(1, "yamil", "moselli", "yamil@hotmail.com");
        Customer c2 = new Customer(2, "john", "malkovich", "john@hotmail.com");
        customerList.add(c1);
        customerList.add(c2);
    }

    @GetMapping("/customer/{id}")
    public Customer getCustomer(@PathVariable int id) {
        for (Customer v: customerList) {
            if (v.getId() == id) {
                return v;
            }
        }
        return null;
    }

    @GetMapping("/customer")
    public List<Customer> getAllCustomer() {
        return customerList;
    }

    @PostMapping("/customer")
    public void addCustomer(@RequestBody Customer c) {
        customerList.add(c);
    }

    @DeleteMapping("/customer/{id}")
    public void deleteCustomer(@PathVariable int id) {
        for (Customer v: customerList) {
            if (v.getId() == id) {
                customerList.remove(v);
                break;
            }
        }
    }

    @PutMapping("/customer/{id}")
    public void updateCustomer(@PathVariable int id, @RequestBody Customer c) {
        for (Customer v: customerList) {
            if (v.getId() == id) {
                customerList.remove(v);
                c.setId(id);
                customerList.add(c);
                break;
            }
        }
    }

    public List<Customer> searchCustomers() {
        return null;
    }

}
