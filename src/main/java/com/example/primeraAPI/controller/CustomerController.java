package com.example.primeraAPI.controller;

import com.example.primeraAPI.entities.Customer;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;

@RestController
public class CustomerController {

    @GetMapping("/hello")
    public String saludo() {
        return "Helloooo";
    }

    @GetMapping("/hello2")
    public String saludo2() {
        return "Hello twooo";
    }

    @GetMapping("/customers")
    public Customer prueba() {
        Customer c1 = new Customer("John", "Smith", "john.smith@gmail.com");
        Customer c2 = new Customer("Jane", "Doe", "jane@doe.com");

        Customer[] customers = new Customer[2];
        customers[0] = c1;
        customers[1] = c2;

        return customers[0];

    }

}
