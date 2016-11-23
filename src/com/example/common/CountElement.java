package com.example.common;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class CountElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> list = new ArrayList<String>();
		list.add("aaa");
		list.add("bbb");
		list.add("aaa");

		Map<String, Integer> wordCount = new HashMap<String, Integer>();

		for(String word: list) {
		  Integer count = wordCount.get(word);  
		  System.out.println("count ::"+count);
		  //System.out.println("KeySet ::"+wordCount.containsKey(word));
		  //wordCount.put(word, (count==null) ? 1 : count+1);
		  if(null==count)
			  wordCount.put(word, 1);
		  else
			  wordCount.put(word, count+1);
		}
		System.out.println("Map of occurances :: "+wordCount);
	}
}
