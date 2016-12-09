package com.reflection;

import java.lang.reflect.Constructor;

public class ReflectionConstructor {
	public static void main(String[] args){
		//create instance of "Class"
		Class<?> c = null;
		try{
			c=Class.forName("com.reflection.Foo");
		}catch(Exception e){
			e.printStackTrace();
		}
 
		//create instance of "Foo"
		Foo f1 = null;
		Foo f2 = null;
 
		//get all constructors
		Constructor<?> cons[] = c.getConstructors();
 
		try {
			f1 = (Foo) cons[0].newInstance();
			f2 = (Foo) cons[1].newInstance("abc");
		} catch (Exception e) {
			e.printStackTrace();
		}	
 
		f1.print();
		f2.print();
	}
}
 
class Foo {
	String s; 
 
	public Foo(){}
 
	public Foo(String s){
		this.s=s;
	}
 
	public void print() {
		System.out.println("HHHHHHHHHHooooooooooo "+s);
	}
}
