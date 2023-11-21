package com.example.banksystem.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.support.BeanDefinitionDsl.Role;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.banksystem.Service.BankExecutiveService;
import com.example.banksystem.Service.UserService;
import com.example.banksystem.enums.RoleType;
import com.example.banksystem.model.BankExecutive;
import com.example.banksystem.model.User;



@RestController
@RequestMapping("/executive")
public class BankExecutiveController {
	
	@Autowired
	private BankExecutiveService BankExecutiveService;
	
	@Autowired
	private UserService userService;
	
	@PostMapping("/add")
	public BankExecutive postBankExecutive(@RequestBody BankExecutive bankExecutive) {
		
		User user = bankExecutive.getUser();
		user.setRole(RoleType.EXECUTIVE);
		
		user = userService.insert(user);
		bankExecutive.setUser(user);
		return BankExecutiveService.save(bankExecutive);
		
	}

}
