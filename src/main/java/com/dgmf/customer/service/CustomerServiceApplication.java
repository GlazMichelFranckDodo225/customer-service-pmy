package com.dgmf.customer.service;

import com.dgmf.customer.service.entity.Customer;
import com.dgmf.customer.service.repository.CustomerRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.List;

@SpringBootApplication
public class CustomerServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(CustomerServiceApplication.class, args);
	}

	// Executed at Application startup
	@Bean
	CommandLineRunner start(CustomerRepository customerRepository) {
		return args -> {
			// Saving 5 Customers
			customerRepository.saveAll(List.of(
					Customer.builder()
							.firstName("John")
							.lastName("Doe")
							.email("johndoe@gmail.com")
							.build(),
					Customer.builder()
							.firstName("Mary")
							.lastName("Grace")
							.email("marygrace@gmail.com")
							.build(),
					Customer.builder()
							.firstName("Jean")
							.lastName("Rivery")
							.email("jeanrivery@gmail.com")
							.build(),
					Customer.builder()
							.firstName("Nolan")
							.lastName("Hombredo")
							.email("nolanhombredo@gmail.com")
							.build(),
					Customer.builder()
							.firstName("Fatou")
							.lastName("Cissé")
							.email("fatoucisse@gmail.com")
							.build()
			));

			// Fetching and Displaying all the Customers
			customerRepository.findAll().forEach(System.out::println);
		};
	}
}
