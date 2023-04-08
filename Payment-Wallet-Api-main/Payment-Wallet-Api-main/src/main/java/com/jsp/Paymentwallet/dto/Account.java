package com.jsp.Paymentwallet.dto;

import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Data;
@Data
@AllArgsConstructor
@Entity
public class Account {
	private int id;
	private String minimumBalance;
	private String accountNumber;
	private String password;
	
}
