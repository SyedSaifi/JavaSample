package com.oracle.interview;

public class ZigZag {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int m = 3;
		int n = 4;
		int val = 1;
		int arr[][]= new int[m][n];
		
		for(int i = 0; i < m; i++){
			for(int j = 0; j < n; j++){
				arr[i][j] = val++;
			}
		}
		
		for(int i = 0; i < m; i++){
			int k = n-1;
			for(int j = 0; j < n ; j++){
				if(i%4 == 0){
					System.out.print(arr[i][j]+",");
				}
				else if(i%4 == 1 && j == n){
					System.out.print(arr[i][j]+",");
				}
				else if(i%4 == 2){
					System.out.print(arr[i][k]+",");
					k--;
				}
				else if(i%4 == 3 && j == 1)
					System.out.print(arr[i][j]+",");
			}
		}

	}
	
	
	/*
	package com.oracle.interview;

public class ZigZag {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int m = 3;
		int n = 4;
		int val = 1;
		int arr[][]= new int[m+1][n+1];
		
		for(int i = 1; i <= m; i++){
			for(int j = 1; j <= n; j++){
				arr[i][j] = val++;
			}
		}
		
		for(int i = 1; i <= m; i++){
			int k = n;
			for(int j = 1; j <= n ; j++){
				if(i%4 == 1){
					System.out.print(arr[i][j]+",");
				}
				else if(i%4 == 2 && j == n){
					System.out.print(arr[i][j]+",");
				}
				else if(i%4 == 3){
					System.out.print(arr[i][k]+",");
					k--;
				}
				else if(i%4 == 0 && j == 1)
					System.out.print(arr[i][j]+",");
			}
		}

	}

}

	 */

}
