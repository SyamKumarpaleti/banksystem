package com.example.banksystem.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.banksystem.model.AccountHolder;

public interface AccountHolderRepository  extends JpaRepository<AccountHolder, Integer>{

	AccountHolder postAccountHolder(AccountHolder accountHolder);

	

}
