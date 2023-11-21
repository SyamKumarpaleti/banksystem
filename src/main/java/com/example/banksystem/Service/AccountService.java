package com.example.banksystem.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.banksystem.Repository.AccountRepository;
import com.example.banksystem.Repository.BankExecutiveRepository;
import com.example.banksystem.model.Account;
import com.example.banksystem.model.BankExecutive;
@Service
public class AccountService {
	@Autowired
	private AccountRepository accountRepository;

	public Account post(Account account) {
		
		return accountRepository.save(account);
	}
	

}
