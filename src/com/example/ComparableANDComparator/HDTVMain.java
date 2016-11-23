package com.example.ComparableANDComparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class HDTVTest implements Comparable<HDTVTest> {
	private int size;
	private String brand;
 
	public HDTVTest(int size, String brand) {
		this.size = size;
		this.brand = brand;
	}
 
	public int getSize() {
		return size;
	}
 
	public void setSize(int size) {
		this.size = size;
	}
 
	public String getBrand() {
		return brand;
	}
 
	public void setBrand(String brand) {
		this.brand = brand;
	}
 
	@Override
	public int compareTo(HDTVTest tv) {
 
		if (this.getSize() > tv.getSize())
			return 1;
		else if (this.getSize() < tv.getSize())
			return -1;
		else
			return 0;
	}
}
 
public class HDTVMain {
	public static void main(String[] args) {
		HDTVTest tv1 = new HDTVTest(75, "Samsung");
		HDTVTest tv2 = new HDTVTest(60, "Sony");
 
		/*if (tv1.compareTo(tv2) > 0) {
			System.out.println(tv1.getBrand() + " is better.");
		} else {
			System.out.println(tv2.getBrand() + " is better.");
		}*/
		
		List<HDTVTest> a1 = new ArrayList<HDTVTest>();
		a1.add(tv1);
		a1.add(tv2);
		
		Collections.sort(a1);
		
		for(HDTVTest h: a1){
			System.out.println(h.getBrand());
		}
	}
}
