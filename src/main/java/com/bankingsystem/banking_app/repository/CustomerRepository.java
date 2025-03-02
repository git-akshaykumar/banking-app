package com.bankingsystem.banking_app.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bankingsystem.banking_app.model.Customer;

public interface CustomerRepository extends JpaRepository<Customer, Long> {
	Optional<Customer> findByEmail(String email);
}
