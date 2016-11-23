package com.example.Filehandling;

import java.io.IOException;
import java.net.URISyntaxException;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class FileRead {

	public static void main(String[] args) {
		FileRead fr  = new FileRead();
		try {
			fr.readFile();
		} catch (URISyntaxException | IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void readFile() throws URISyntaxException, IOException{
		final String EoL = System.getProperty("line.separator");
    	List<String> lines;
    	String url = "D:/Projects/TestWorkspace/JavaSample/src/com/example/blob/p1.xml";
			if(Files.exists(Paths.get(url))){
				lines = Files.readAllLines(Paths.get(url));
				StringBuilder sb = new StringBuilder();
				for (String line : lines) {
					sb.append(line).append(EoL);
					System.out.println(sb.toString());
				}
			}
	}

}
