package com.example.banksystem.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.banksystem.Repository.BankExecutiveRepository;
import com.example.banksystem.model.BankExecutive;

@Service
public class BankExecutiveService {
	@Autowired
	private BankExecutiveRepository bankExecutiveRepository;
	public BankExecutive save(BankExecutive bankExecutive) {
		return bankExecutiveRepository.save(bankExecutive);
		
	}
	
	

}
