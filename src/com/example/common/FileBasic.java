package com.example.common;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileBasic {
	static char[] ch = new char[50];
	public static void main(String[] args){
		File dir = new File("NewDirectory");
		dir.mkdir();
		File file = new File(dir,"testfile.txt");
		try {
			FileWriter fw = new FileWriter(file);
			fw.write("This is a test file");
			fw.flush();
			fw.close();
			
			FileReader fr = new FileReader(file);
			int size = fr.read(ch);
			System.out.println("The size = "+size);
			for(char c: ch){
				System.out.println(c);
			}
			fr.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
