package com.example.Filehandling;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderTest {

	public static void main(String[] args) {
		FileReaderTest tr = new FileReaderTest();
		tr.read();
		
	}
	
	public void read(){
		final String EoL = System.getProperty("line.separator");
    	String line;
    	StringBuilder sb = new StringBuilder();
    	try {
    		FileReader fr = new FileReader("bin/com/example/blob/p1.xml");
    		BufferedReader br = new BufferedReader(fr);
    		while ((line = br.readLine()) != null)
    		{
				sb.append(line).append(EoL);
			}
    		System.out.println(sb.toString());
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
	}
	
}
