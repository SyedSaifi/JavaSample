package com.example.misc;
interface Parent {
	public  void method1();
	public  void method2();

}

class Child implements Parent{
public  void method1(){
		System.out.println("Diiiiiiiiii");
	}

public  void method2(){
	System.out.println("Fiiiiiiiiiii");
}
}

public class TestFinal{
	public static void main(String[] args) {
		Parent ph = new Child();
		System.out.println(ph instanceof Parent);
		
	}
}
