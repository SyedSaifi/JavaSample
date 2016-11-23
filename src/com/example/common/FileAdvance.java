package com.example.common;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;

public class FileAdvance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File file = new File("testfileNew.txt");
		try {
			PrintWriter pw = new PrintWriter(file);
			pw.println("This a new file");
			pw.println("Welcome Syed!!!");
			pw.flush();
			pw.close();
			
			FileReader fr = new FileReader(file);
			BufferedReader br = new BufferedReader(fr);
			String s;
			while((s= br.readLine()) != null){
				System.out.println(s);
			}
			br.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
