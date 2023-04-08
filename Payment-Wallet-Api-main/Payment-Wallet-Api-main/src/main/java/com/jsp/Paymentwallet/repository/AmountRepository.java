package com.jsp.Paymentwallet.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jsp.Paymentwallet.dto.Amount;

public interface AmountRepository extends JpaRepository<Amount, Integer>{

}
