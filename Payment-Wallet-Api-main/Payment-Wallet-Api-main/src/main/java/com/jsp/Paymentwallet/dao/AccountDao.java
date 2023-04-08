package com.jsp.Paymentwallet.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.jsp.Paymentwallet.dto.Account;
import com.jsp.Paymentwallet.repository.AccountRepository;

@Repository
public class AccountDao {
	@Autowired
	AccountRepository repository;
	
	public Account saveAccount(Account account) {
		return repository.save(account);
	}
	
}
