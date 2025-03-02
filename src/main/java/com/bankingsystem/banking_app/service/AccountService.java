package com.bankingsystem.banking_app.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.bankingsystem.banking_app.model.Account;
import com.bankingsystem.banking_app.repository.AccountRepository;


@Service
public class AccountService {

	private AccountRepository accountRepository;
	
	public List<Account> getAllAccounts(){
		return accountRepository.findAll();
	}
	
	
	public Optional<Account> getAccountById(Long id){
		return accountRepository.findById(id);
	}
	
	public Account createAccount(Account account) {
		return accountRepository.save(account);
	}
	
	public void deleteAccount(Long id) {
		accountRepository.deleteById(id);
	}
}
