package com.example.serialization;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Person extends TestClass implements Serializable{
	/*The serialVersionUID is a universal version identifier for a Serializable class.
	 *  Deserialization uses this number to ensure that a loaded class corresponds exactly 
	 *  to a serialized object. If no match is found, then an InvalidClassException is thrown.
	 */
	private static final long serialVersionUID = -6722014916800997180L;
	private String name;
	private int age;
	private String fatherName;
	private transient int experience;
	private Company company;
	private transient boolean flag;

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getFatherName() {
		return fatherName;
	}
	public void setFatherName(String fatherName) {
		this.fatherName = fatherName;
	}
	public int getExperience() {
		return experience;
	}
	public void setExperience(int experience) {
		this.experience = experience;
	}
	public Company getCompany() {
		return company;
	}
	public void setCompany(Company company) {
		this.company = company;
	}
	public boolean isFlag() {
		return flag;
	}
	public void setFlag(boolean flag) {
		this.flag = flag;
	}
	
	private void writeObject(ObjectOutputStream out) throws IOException {
		out.defaultWriteObject();
		out.writeObject(flag);
	}
 
	private void readObject(ObjectInputStream in) throws IOException,ClassNotFoundException {
		in.defaultReadObject();
		this.flag = (boolean) in.readObject();
	}
}
