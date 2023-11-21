package com.example.banksystem.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.banksystem.Repository.AccountHolderRepository;
import com.example.banksystem.Repository.BankExecutiveRepository;
import com.example.banksystem.model.AccountHolder;
import com.example.banksystem.model.BankExecutive;
@Service
public class AccountHolderService {
	@Autowired
	private AccountHolderRepository accountHolderRepository;

	public AccountHolder post(AccountHolder accountHolder) {
		
		return accountHolderRepository.postAccountHolder(accountHolder);
	}
	
}
