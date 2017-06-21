package com.example.Filehandling;

import java.util.StringTokenizer;  
public class SimpleTokenizer{  
 public static void main(String args[]){  
	 String str = "my name is khan";
	 String[] arr = str.split(" ");
	 System.out.println(arr[2]);
	 
   StringTokenizer st = new StringTokenizer("my name is khan"," ");  
     while (st.hasMoreTokens()) {  
         System.out.println(st.nextToken());  
     }  
   }  
}  