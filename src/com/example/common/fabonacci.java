package com.example.common;

public class fabonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("The nth number in series is :: "+ fibonacci(5));
	}
	
	public static int fibonacci(int n){
		int sum=0;
		int first=0;
		int second=1;
		if(n==1)
			return n;
		for(int i=2;i<=n;i++){
			sum=first+second;
			first=second;
			second=sum;
		}
		return sum;
	}//0 1 1 2 3 5 8
	
	/*public static int fibonacci(int n)  {
	    if(n == 0)
	        return 0;
	    else if(n == 1)
	      return 1;
	   else
	      return fibonacci(n - 1) + fibonacci(n - 2);
	}*/
}
