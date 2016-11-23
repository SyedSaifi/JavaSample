package com.example.Collection;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class LinkListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> list = new LinkedList<String>();
		list.add("aaa");
		list.add("bbb");
		list.add("ccc");
		list.add("ddd");
		list.add("eee");
		
		list.add(2,"fff");
		//list.remove(2);
		System.out.println(list.get(2));
		
		
		Iterator it = list.iterator();
		while(it.hasNext()){
			System.out.println(it.next());
		}
	}

}
