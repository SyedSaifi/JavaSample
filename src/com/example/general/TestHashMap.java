package com.example.general;

import java.util.HashMap;
import java.util.Map;

public class TestHashMap {

	public static void main(String[] args) {
		Map<String, Integer> m_fieldMap = new HashMap<String, Integer>();
		for(int i=0;i<10000;i++)
			m_fieldMap.put("Value"+i, i);
		long m1 = System.currentTimeMillis();
		int i= m_fieldMap.get("Value797");
		long m2 = System.currentTimeMillis();
		System.out.println(i+ "Time taken to fetch :: "+ (m2-m1));
	}

}
