package com.example.Lambda;

public class ClosureLambda {

	public static void main(String[] args) {
		int a=10;
		int b=20;
		
		doProcess(a, i -> System.out.println(a+b));
	}
	
	public static void doProcess(int a, Process p){
		p.process(a);
	}

}

interface Process{
	void process(int a);
}
