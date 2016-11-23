package com.example.Lambda;

import java.util.*;

public class ComparatorLambda {

	public static void main(String[] args) {

		List<String> str = new ArrayList<>();
		str.add("bcd");
		str.add("cbaa");
		str.add("ss");
		str.add("s");
		
		System.out.println("Before Sorting..");
		Iterator<String> it = str.iterator();
		while(it.hasNext())
			System.out.print(it.next()+",");
		
		Collections.sort(str, (String first, String second) -> Integer.compare(first.length(), second.length()));
		
		System.out.println("");
		System.out.println("After Sorting..");
		Iterator<String> itr = str.iterator();
		while(itr.hasNext())
			System.out.print(itr.next()+",");
	}

}
