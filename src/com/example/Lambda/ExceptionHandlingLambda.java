package com.example.Lambda;

import java.util.function.BiConsumer;

public class ExceptionHandlingLambda {

	public static void main(String[] args) {
		int[] somenumber = {1,3,4,6};
		int key =0; 
		process(somenumber, key, wrapperLambda((v,k) -> System.out.println(v/k)));
	}
	
	public static void process(int[] somenumber, int key, BiConsumer<Integer,Integer> consumer){
		for(int i: somenumber)
			consumer.accept(i, key);
	}
	
	public static BiConsumer<Integer,Integer> wrapperLambda(BiConsumer<Integer,Integer> consumer){
		return (v,k) -> {
			try{
				consumer.accept(v, k);
			}catch(ArithmeticException e){
				System.out.println("ArithmeticException happened");
			}
		};
	}

}
