package com.example.spring.springdatajdbc;

import java.time.LocalDate;
//import @org.springframework.data.annotation.Id;

class Customer {
    //@Id
    @org.springframework.data.annotation.Id
    Long id;
    String firstName;
    LocalDate dob;
}

