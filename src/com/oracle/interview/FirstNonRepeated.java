package com.oracle.interview;

import java.util.HashMap;
import java.util.Scanner;

public class FirstNonRepeated {

	public static void main(String[] args) {
		System.out.println(" Please enter the input string :");
		Scanner in = new Scanner(System.in);
		String s = in.nextLine();
		char c = firstNonRepeatedCharacter(s);
		System.out.println("The first non repeated character is :  " + c);
	}

	public static Character firstNonRepeatedCharacter(String str) {
		Character c;
		HashMap<Character, Integer> characterhashtable = new HashMap<Character, Integer>();
		
		for (int i = 0; i < str.length(); i++) {
			c = str.charAt(i);
			if (characterhashtable.containsKey(c)) {
				characterhashtable.put(c, characterhashtable.get(c) + 1);
			} else {
				characterhashtable.put(c, 1);
			}
		}

		for (int i = 0; i < str.length(); i++) {
			c = str.charAt(i);
			if (characterhashtable.get(c) == 1)
				return c;
		}
		return null;
	}
}