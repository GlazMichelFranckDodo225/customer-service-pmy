package com.dgmf.customer.service.repository;

import com.dgmf.customer.service.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

// To expose Restfull Web Service that handles Customers
@RepositoryRestResource
public interface CustomerRepository extends JpaRepository<Customer, Long> {
}
