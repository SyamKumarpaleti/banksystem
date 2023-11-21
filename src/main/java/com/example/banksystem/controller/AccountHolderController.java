package com.example.banksystem.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.banksystem.Service.AccountHolderService;
import com.example.banksystem.model.AccountHolder;


@RestController
@RequestMapping("/accountholder")
public class AccountHolderController {
	@Autowired
	private AccountHolderService accountHolderService;
	
	@PostMapping("/add")
	public AccountHolder postAccountHolder(@RequestBody AccountHolder accountHolder) {
		return accountHolderService.post(accountHolder);
		
	}

}