package com.example.ExceptionHandle;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class TryWithResource {

	public static void main(String[] args) {

		try (
				FileReader fr = new FileReader("D:\\p1.xml");
				BufferedReader br = new BufferedReader(fr)
			)
		{

			String line;

			while ((line = br.readLine()) != null) {
				System.out.println(line);
			}

		} catch (IOException e) {
			e.printStackTrace();
		} 

	}
}