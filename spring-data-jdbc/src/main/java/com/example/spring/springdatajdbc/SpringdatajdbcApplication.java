package com.example.spring.springdatajdbc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
// see JdbcRepositoriesAutoConfiguration
// > Once in effect, the auto-configuration is the equivalent of enabling JDBC repositories
// > using the EnableJdbcRepositories annotation and providing a JdbcConfiguration subclass.
public class SpringdatajdbcApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringdatajdbcApplication.class, args);
	}
}
