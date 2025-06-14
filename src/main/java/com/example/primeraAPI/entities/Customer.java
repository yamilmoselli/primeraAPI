package com.example.primeraAPI.entities;

import lombok.*;

@Getter @Setter @AllArgsConstructor @NoArgsConstructor @ToString
public class Customer {

    private int id;
    private String name;
    private String surname;
    private String email;

}
