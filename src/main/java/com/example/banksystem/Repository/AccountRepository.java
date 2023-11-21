package com.example.banksystem.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.banksystem.model.Account;

public interface AccountRepository extends JpaRepository<Account, Integer> {

	

}
