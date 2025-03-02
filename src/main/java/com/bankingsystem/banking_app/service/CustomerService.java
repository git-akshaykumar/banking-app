package com.bankingsystem.banking_app.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import com.bankingsystem.banking_app.model.Customer;
import com.bankingsystem.banking_app.repository.CustomerRepository;

@Service
public class CustomerService {
	
	@Autowired
	private CustomerRepository customerRepository;
	
	public List<Customer> getAllCustomers(){
		return customerRepository.findAll();
	}
	
	
	public Customer createCustomer(Customer customer) {
		return customerRepository.save(customer);
	}
	
	public Optional<Customer> getCustomerById(Long id){
		return customerRepository.findById(id);
	}
	
	public void deleteCustomer(Long id) {
		customerRepository.deleteById(id);
	}
}
