package com.oracle.interview;

import java.util.Scanner;

public class HourMinAngle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println("Hour :::");
		float hour = sc.nextFloat();
		System.out.println("Min :::");
		float min = sc.nextFloat();
		
		if(hour>=0 && hour<=12){
	        if(min>=0 && min<=59){
	        		float hourAngle = (float) ((hour * 30) + (min * 0.5));
	        		float minAngle = (min * 6);
	        		float diff =  Math.abs(hourAngle-minAngle);
	        		if(diff <180) 
	        			System.out.println("The angle difference is ::: "+diff);
	        		else
	        			System.out.println("The angle difference is ::: "+(360-diff));
	        }
		}else{
	        System.out.println("Wrong input ");
	    }
	}

}
