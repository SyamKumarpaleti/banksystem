package com.example.banksystem.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.banksystem.Service.AccountService;
import com.example.banksystem.model.Account;

@RestController
@RequestMapping("/account")
public class AccountController {
	@Autowired
	private AccountService accountService;
	@PostMapping("/add")
	public Account postAccount(@RequestBody Account account ) {
		return accountService.post(account);
	}

}
