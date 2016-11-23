package com.example.string;

public class StringEqulas {
	public static void main(String args[]){
	String str = "asd";
	String str1 = "asd";
	
	if(str.length() != str1.length())
	System.out.println("not equal");
	else{
		int i=0;
	for(;i<str.length();i++){
	if(str.charAt(i)-str1.charAt(i) !=0) 
	break;
	}
	if(i == str.length())
	System.out.println("equal");
	else
	System.out.println("not equal"); 
	}
}
}