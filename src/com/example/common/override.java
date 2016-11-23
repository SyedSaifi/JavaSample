package com.example.common;

import java.io.FileNotFoundException;

public class override {

	public void methodA() throws Exception{
		System.out.println("Hiiiiiii");
	}
}

class child extends override{
	public void methodA() throws FileNotFoundException{
		System.out.println("Hiiiiiii");
	}
}
