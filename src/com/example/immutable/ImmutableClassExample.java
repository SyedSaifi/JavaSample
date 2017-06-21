package com.example.immutable;

import java.util.HashMap;
import java.util.Iterator;

public final class ImmutableClassExample {

	private final int id;
	private final String name;
	private final HashMap<String,String> testMap;
	private final Address addr;
	
	public int getId() {
		return id;
	}


	public String getName() {
		return name;
	}

	public Address getAddr() {
		return new Address(addr.getStreet(),addr.getCity(),addr.getCountry());
	}
	
	public HashMap<String, String> getTestMap() {
		return (HashMap<String, String>) testMap.clone();
	}

	public ImmutableClassExample(int i, String n, HashMap<String,String> hm, Address addr){
		System.out.println("Performing Deep Copy for Object initialization");
		this.id=i;
		this.name=n;
		
		HashMap<String,String> tempMap=new HashMap<String,String>();
		String key;
		
		Iterator<String> it = hm.keySet().iterator();
		while(it.hasNext()){
			key=it.next();
			tempMap.put(key, hm.get(key));
		}
		this.testMap=tempMap;
		
		this.addr=new Address(addr.getStreet(),addr.getCity(),addr.getCountry());
	}
	
	
	/**
	public FinalClassExample(int i, String n, HashMap<String,String> hm){
		System.out.println("Performing Shallow Copy for Object initialization");
		this.id=i;
		this.name=n;
		this.testMap=hm;
	}
	*/
	
	public static void main(String[] args) {
		HashMap<String, String> h1 = new HashMap<String,String>();
		h1.put("1", "first");
		h1.put("2", "second");
		
		String s = "original";
		
		int i=10;
		
		Address addr = new Address("Marks street", "bangalore", "india");
		
		ImmutableClassExample ce = new ImmutableClassExample(i,s,h1,addr);
		
		//Lets see whether its copy by field or reference
		System.out.println(s==ce.getName());
		System.out.println(h1 == ce.getTestMap());
		System.out.println(addr == ce.getAddr());
		
		//print the ce values
		System.out.println("ce id:"+ce.getId());
		System.out.println("ce name:"+ce.getName());
		System.out.println("ce testMap:"+ce.getTestMap());
		System.out.println("ce Address: "+ce.getAddr().toString());
		
		//change the local variable values
		i=20;
		s="modified";
		h1.put("3", "third");
		addr.setCity("Kolkata");
		
		//print the values again
		System.out.println("ce id after local variable change:"+ce.getId());
		System.out.println("ce name after local variable change:"+ce.getName());
		System.out.println("ce testMap after local variable change:"+ce.getTestMap());
		System.out.println("ce Address after local variable change: "+ce.getAddr().toString());
		
		HashMap<String, String> hmTest = ce.getTestMap();
		hmTest.put("4", "new");
		
		Address addr1 = ce.getAddr();
		addr1.setStreet("kundanhalli");
		
		System.out.println("ce testMap after changing variable from accessor methods:"+ce.getTestMap());
		System.out.println("ce Address after changing variable from accessor methods: "+ce.getAddr().toString());
	}

}