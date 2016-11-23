package com.example.general;

public class RevFibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int febCount = 7;
        int[] feb = new int[febCount];
        feb[0] = 0;
        feb[1] = 1;
        for(int i=2; i < febCount; i++){
            feb[i] = feb[i-1] + feb[i-2];
        }

        for(int i=febCount-1; i>= 0; i--){
                System.out.print(feb[i] + " ");
        }

	}

}
