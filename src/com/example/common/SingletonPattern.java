package com.example.common;

class SingletonPatternDemo {
	private static SingletonPatternDemo instance;

	private SingletonPatternDemo() {
	}

	public static synchronized SingletonPatternDemo getInstance() {
		if (instance == null) {
			instance = new SingletonPatternDemo();
		}
		return instance;
	}

	/*
	 * public static void main(String arg[]){ System.out.println(
	 * "The output of two instance:"); SingletonPattern sp=new
	 * SingletonPattern(); System.out.println("First Instance: "
	 * +sp.getInstance()); sp=new SingletonPattern(); System.out.println(
	 * "Second Instance:"+sp.getInstance()); }
	 */
}

public class SingletonPattern {
	public static void main(String arg[]) {
		SingletonPatternDemo pattern = SingletonPatternDemo.getInstance();
		System.out.println("The output of two instance:");
		System.out.println("First Instance: " + pattern.getInstance());
		System.out.println("Second Instance:" + pattern.getInstance());
	}
}
