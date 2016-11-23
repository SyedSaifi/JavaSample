package com.example.Lambda;

public class LambdaOne {

	final static String salutation = "Hello! ";
	   
	   public static void main(String args[]){
	      GreetingService greetService1 = message1 -> System.out.println(salutation + message1);
	      greetService1.sayMessage("Mahesh");
	   }
		
	   interface GreetingService {
	      void sayMessage(String message);
	   }
	}

