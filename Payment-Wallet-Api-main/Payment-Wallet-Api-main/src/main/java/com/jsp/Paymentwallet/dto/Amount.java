package com.jsp.Paymentwallet.dto;

import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
@Entity
public class Amount {
	private int id;
	private double money;
	private String msg;
}
