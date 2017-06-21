package com.oracle.interview;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class MagicPair {

	public static void main(String[] args) {
		int[] arr = {4, 3, 6, 6, 7, 5, 8};
		//getPair(arr, 10);
		printPairsUsingSet(arr, 10);
		//printPairsUsingTwoPointers(arr,10);
	}
	
	public static void getPair(int[] arr, int n){
		int c=0;
		int size=arr.length;
		while(c<size){
			for(int i=0;i<size;i++){
				if(arr[i] == n-arr[c] && c!=i)
					System.out.println(arr[c]+"  "+arr[i]);
			}
			c++;
		}
		}
	
	public static void printPairsUsingSet(int[] arr, int n){ 
		if(arr.length < 2){ 
			return; 
			} 
		
		Set set = new HashSet(arr.length); 
		
		for(int value : arr){ 
			int target = n - value; 

			if(!set.contains(target)){ 
				set.add(value); 
				}
			else 
				{ 
				System.out.println("("+value+ ","+target+")"); 
				} 
			} 
		}
	
	}
