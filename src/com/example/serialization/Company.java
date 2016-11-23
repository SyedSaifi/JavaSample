package com.example.serialization;

import java.io.Serializable;

public class Company implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = -221541835127836161L;
	private String companyName;

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
	
}
