package com.example.general;

public class Fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 7;
		for (int i = 0; i < n; i++) {
	           System.out.print(fibo(i) + " ");
	       }
	}
	
	public static int fibo(int n){
		if(n <= 1)
			return n;
		else
			return fibo(n-1)+fibo(n-2);
	}

}
