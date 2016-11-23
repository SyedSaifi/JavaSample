package com.example.common;

import java.lang.reflect.Method;

public class ReflectionHelloWorld {
	
	public static void main(String[] args){
		//create instance of "Class"
		Class<?> c = null;
		try{
			c=Class.forName("test.Foo");
		}catch(Exception e){
			e.printStackTrace();
		}
 
		//create instance of "Foo"
		Foo f = null;
 
		try {
			f = (Foo) c.newInstance();
		} catch (Exception e) {
			e.printStackTrace();
		}	
 
		f.print();
		//Invoke method on unknown object
		Foo f1 = new Foo();
		Method method;
		try {
			method = f1.getClass().getMethod("print", new Class<?>[0]);
			method.invoke(f1);
		} catch (Exception e) {
			e.printStackTrace();
		}	

	}

}

class Foo {
	public void print() {
		System.out.println("abc");
	}
}
