package com.example.common;

import java.util.HashMap;
import java.util.Map;

public class HashMapTest {
	private final String str=null;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Map<String,Integer> map = new HashMap<String,Integer>();
		map.put(new String("aaa"), 10);
		map.put(new String("aaa"), 11);
		System.out.println("Map :: "+map);*/

		Map<testKey,Integer> map1 = new HashMap<testKey,Integer>();
		testKey k1 = new testKey(7,10);
		testKey k2 = new testKey(7,10);
		map1.put(k1, 101);
		map1.put(k2, 111);
		System.out.println("Map :: "+map1);
		System.out.println("Get Value :: "+map1.get(k1));
	}
}
