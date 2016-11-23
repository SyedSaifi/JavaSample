package com.example.common;

public class PrivateTest{
    private PrivateTest(){
            System.out.println("Private Default Constructor");
    }
    public static PrivateTest getInstance(){
            return new PrivateTest();
    }

}
 
/*class PrivateTest2 extends PrivateTest{

}*/