package com.example.misc;
class Parent {
	public Parent(){
		throw new RuntimeException();
	}
	
	public  void method1(){
		System.out.println("Hiiiiiiiii");
	}
	public  void method2(){
		System.out.println("Yiiiiiiiiii");
	}

}

class Child extends Parent{
public  void method1(){
		System.out.println("Diiiiiiiiii");
	}

public  void method3(){
	System.out.println("Fiiiiiiiiiii");
}
}

public class TestFinal{
	public static void main(String[] args) {
		Parent ph = new Parent();
		System.out.println(ph instanceof Parent);
		
	}
}
