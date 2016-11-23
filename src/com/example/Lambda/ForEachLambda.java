package com.example.Lambda;

import java.util.ArrayList;
import java.util.List;

public class ForEachLambda {

	public static void main(String[] args) {

		List<String> list = new ArrayList<>();
		list.add("Mark");
		list.add("Smith");
		list.add("Roy");
		list.add("Sam");
		
		list.forEach(str->System.out.println(str));
		
		list.removeIf(str -> "Smith".equals(str));
		
		list.replaceAll(str -> str.toUpperCase());
		
		list.forEach(str->System.out.println(str));
		
		//Method Reference
		list.replaceAll(String::toLowerCase);
		
		list.forEach(str->System.out.print(str+" "));
	}

}
