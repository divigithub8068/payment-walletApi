package com.jsp.Paymentwallet.dto;

import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
@Entity
public class User {
	private int id;
	private String name;
	private long phone;
	private String email;
	private String password;
}
