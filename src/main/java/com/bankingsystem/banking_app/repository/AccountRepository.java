package com.bankingsystem.banking_app.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bankingsystem.banking_app.model.Account;

public interface AccountRepository extends JpaRepository<Account, Long> {
	Optional<Account> findByAccountNumber(String accountNumber);
}
