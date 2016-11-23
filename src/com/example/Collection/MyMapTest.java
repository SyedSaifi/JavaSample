package com.example.Collection;

public class MyMapTest {



	  public static void main(String[] args){
    // MyMap
    MyMap<String, Integer> map = new MyMap<String, Integer>();
    map.put("Lars", 1);
    map.put("mars", 2);
    map.put("bars", 1);
    for (int i = 0; i < map.size(); i++) {
      System.out.println("Map :: "+map.get("Lars"));
    }
	  
	}
} 