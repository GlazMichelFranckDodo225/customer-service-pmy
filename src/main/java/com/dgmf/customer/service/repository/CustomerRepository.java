package com.dgmf.customer.service.repository;

import com.dgmf.customer.service.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

// Allows Spring Data Rest to expose Restfull Web Services that
// handle Customers on the Endpoint ==> http://localhost:8081/customers
@RepositoryRestResource
public interface CustomerRepository extends JpaRepository<Customer, Long> {
}
