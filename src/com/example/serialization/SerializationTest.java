package com.example.serialization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class SerializationTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person person = new Person();
		person.setName("Syed");
		person.setAge(27);
		person.setExperience(4);
		person.setFatherName("naimuddin");
		person.setSupername("Talib");
		person.setFlag(true);
		
		Company company = new Company();
		company.setCompanyName("Toshiba");
		person.setCompany(company);
		
		try {
			FileOutputStream fos = new FileOutputStream("Person.txt");
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			oos.writeObject(person);
			oos.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		try {
			FileInputStream fis = new FileInputStream("Person.txt");
			ObjectInputStream ois = new ObjectInputStream(fis);
			Person personRead =  (Person) ois.readObject();
			ois.close();
			System.out.println("Name :: "+ personRead.getName()+", Age :: "+personRead.getAge()+", Father Name :: "+personRead.getFatherName()+
					", Experience :: "+personRead.getExperience()+", Company name ::"+personRead.getCompany().getCompanyName()+", "
							+ "SuperName ::"+personRead.getSupername()+", Flag ::"+personRead.isFlag());
		} catch (FileNotFoundException e) { 
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
