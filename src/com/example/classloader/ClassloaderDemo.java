package com.example.classloader;

import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLClassLoader;

public class ClassloaderDemo {

	@SuppressWarnings("resource")
	public static void main(String[] args) {

		 URL classUrl;
	        try {
				classUrl = new URL("file:/D:/prm-pcs-connector-16-v1.0.jar");
				URL[] classUrls = { classUrl };
				URLClassLoader ucl = new URLClassLoader(classUrls);
				Class<?> c = ucl.loadClass("com.primavera.bpm.BPMConnectorImpl"); 
				c.newInstance();
			} catch (MalformedURLException | ClassNotFoundException | InstantiationException | IllegalAccessException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	        
	}

}
