package com.example.datastructures;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;


public class CountElement {

	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		list.add("aaa");
		list.add("bbb");
		list.add("aaa");

		Map<String, Integer> wordCount = new HashMap<String, Integer>();

		for(String word: list) {
		  Integer count = wordCount.get(word);  
		  System.out.println("count ::"+count);
		  wordCount.put(word, (count==null) ? 1 : count+1);
		}
		
		Iterator it = wordCount.entrySet().iterator();
		while(it.hasNext()){
			Map.Entry mp = (Map.Entry) it.next();
		System.out.println("Map of occurances :: "+mp.getKey()+"  "+mp.getValue());
	}
}
}
