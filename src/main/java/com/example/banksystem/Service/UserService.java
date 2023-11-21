package com.example.banksystem.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.banksystem.Repository.UserRepository;
import com.example.banksystem.model.User;
@Service
public class UserService {
	@Autowired
	private UserRepository userRepository;

	public User insert(User user) {
		// TODO Auto-generated method stub
		return userRepository.save(user);
	}

	
}
