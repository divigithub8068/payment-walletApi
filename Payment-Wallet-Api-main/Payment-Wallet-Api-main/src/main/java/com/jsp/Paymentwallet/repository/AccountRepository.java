package com.jsp.Paymentwallet.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jsp.Paymentwallet.dto.Account;

public interface AccountRepository extends JpaRepository<Account, Integer>{

}
