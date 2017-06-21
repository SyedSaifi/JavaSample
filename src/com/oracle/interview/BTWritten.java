package com.oracle.interview;

public class BTWritten extends Thread{

	public static void main(String[] args) throws InterruptedException 
	{
		/*BTWritten bt = new BTWritten();
		bt.start();
		bt.join();
		System.out.println("main thread");*/
		
		Customer c= new Customer();
		c.setId(10);
		System.out.println(c.getId());
		modifyId(c);
		c.setId(11);
		System.out.println(c.getId());
	}
	
	public void run()
	{
		System.out.println("Thread running");
	}
	
	public static void modifyId(Customer c)
	{
		c= null;
	}
	
}

class Customer{
	private int id;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
}