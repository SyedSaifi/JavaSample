package com.example.common;

public class test {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "hello my name is";
        String str1="";
        int count =0;
        String[] reverse = new String[10];

        for(int i=0;i<str.length();i++){
            if(str.charAt(i)==' ')
                count++;
        }   
        System.out.println("count :"+count);
        int c = count;
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)!=' '){
                str1 = str1+str.charAt(i);
            }
            if(str.charAt(i)==' '){
                reverse[--count] = str1;
                str1="";
            }
        }
            for(int i=0;i<c;i++)
            str1 = str1.concat(" "+reverse[i]);
        
        System.out.println(str1);
        
}
}
