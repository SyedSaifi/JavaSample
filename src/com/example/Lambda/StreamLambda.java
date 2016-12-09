package com.example.Lambda;

import java.util.ArrayList;
import java.util.List;

public class StreamLambda {

	public static void main(String[] args) {

		List<String> list = new ArrayList<>();
		list.add("david");
		list.add("sam");
		list.add("obamma");
		list.add("su");
		
		Long count = list.parallelStream().
		filter(p -> p.startsWith("s")).
		count();
		System.out.println("Count :: "+count);
		
		list.stream().
		filter(p -> p.startsWith("s")).
		forEach(p -> System.out.println(p));
	}

}
