package com.oracle.interview;

public class MyStringToNumber {
	 
    public static int convert_String_To_Number(String numStr){
         
        char ch[] = numStr.toCharArray();
        int sum = 0;
        //get ascii value for zero
        for(char c:ch){
            sum = (sum*10)+((int)c-(int)'0');
        }
        return sum;
    }
     
    public static void main(String a[]){
         
        System.out.println("\"3256\" == "+convert_String_To_Number("3256"));
        System.out.println("\"76289\" == "+convert_String_To_Number("76289"));
        System.out.println("\"90087\" == "+convert_String_To_Number("90087"));
    }
}
