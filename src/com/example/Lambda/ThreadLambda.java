package com.example.Lambda;

public class ThreadLambda {

	public static void main(String[] args) {

		Thread t = new Thread(()-> System.out.println("Running the run method"));
		t.start();
	}

}
