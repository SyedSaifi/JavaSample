package com.example.Lambda;

public class MetthodReferrenceLambda {
	public static void main(String[] args) {

		Thread t = new Thread(MetthodReferrenceLambda::print);
		t.start();
	}
	
	public static void print(){
		System.out.println("Running the run method");
	}

}
