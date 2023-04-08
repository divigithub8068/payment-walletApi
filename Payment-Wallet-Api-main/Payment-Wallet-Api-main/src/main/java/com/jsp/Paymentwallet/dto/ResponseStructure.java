package com.jsp.Paymentwallet.dto;

import lombok.Data;

@Data
public class ResponseStructure<T> {
	private String msg;
	private int code;
	private T data;
}
