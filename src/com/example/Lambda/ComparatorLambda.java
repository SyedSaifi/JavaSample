package com.example.Lambda;

import java.util.*;
import java.util.function.Predicate;

public class ComparatorLambda {

	public static void main(String[] args) {

		List<String> str = new ArrayList<>();
		str.add("david");
		str.add("sam");
		str.add("obamma");
		str.add("su");
		
		System.out.println("Before Sorting..");
		printConditionally(str, s -> true);
		
		System.out.println("After Sorting..");
		Collections.sort(str, (first, second) -> first.compareTo(second));
		printConditionally(str, s -> true);
		
		System.out.println("After sorting conditionally");
		printConditionally(str, s -> s.startsWith("s"));
	}
	
    public static void printConditionally(List<String> str, Predicate<String> pr){
    	for(String s : str){
    		if(pr.test(s))
    			System.out.println(s);
    	}
	}
}
