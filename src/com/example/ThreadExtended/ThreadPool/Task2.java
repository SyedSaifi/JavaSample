package com.example.ThreadExtended.ThreadPool;

public class Task2 implements Runnable{
	
	public void run(){
		System.out.println(Thread.currentThread().getName()+" :: Performing task2");
		
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
