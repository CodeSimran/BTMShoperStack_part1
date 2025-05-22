package com.edu.jsp.shoperstack.util;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ResponseStructure<T> {
	private String message;
	private T data;
	public void setMessage(String message2) {
		// TODO Auto-generated method stub
		System.out.println("hello");
		
	}
	public void setData(String string) {
		// TODO Auto-generated method stub
		System.out.println("hi");
		
	}
}
