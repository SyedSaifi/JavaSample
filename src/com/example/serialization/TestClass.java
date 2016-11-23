package com.example.serialization;

import java.io.Serializable;

public class TestClass implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 7922198477246862657L;
	private String supername;

	public String getSupername() {
		return supername;
	}

	public void setSupername(String supername) {
		this.supername = supername;
	}
}
