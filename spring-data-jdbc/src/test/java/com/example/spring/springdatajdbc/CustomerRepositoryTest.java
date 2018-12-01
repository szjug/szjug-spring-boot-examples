package com.example.spring.springdatajdbc;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.transaction.annotation.Transactional;

import java.time.LocalDate;
import java.util.Optional;

import org.junit.Assert.*;

@RunWith(SpringRunner.class)
@Transactional
@ContextConfiguration(classes = CustomerConfig.class)
public class CustomerRepositoryTest {

    @Autowired
    CustomerRepository customerRepo;

    @Test
    public void createSimpleCustomer() {

        Customer customer = new Customer();
        customer.dob = LocalDate.of(1904, 5, 14);
        customer.firstName = "Albert";

        Customer saved = customerRepo.save(customer);

       // assertThat(saved.id).isNotNull();

        saved.firstName = "Hans Albert";

        customerRepo.save(saved);

        Optional<Customer> reloaded = customerRepo.findById(saved.id);

       // assertThat(reloaded).isNotEmpty();

        //assertThat(reloaded.get().firstName).isEqualTo("Hans Albert");
    }
}

