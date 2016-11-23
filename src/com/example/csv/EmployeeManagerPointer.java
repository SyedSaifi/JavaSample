package com.example.csv;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class EmployeeManagerPointer {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		EmployeeManagerPointer obj = new EmployeeManagerPointer();
		obj.PointerList();
	}
	
	public void PointerList()
	{
		String loc= "F:/employeeManager.txt";
		String line="";
		String csvsplit=",";
		BufferedReader br=null;
		
		List<EmployeeTable> empList = new ArrayList<EmployeeTable>();
		
		try {
			br = new BufferedReader(new FileReader(loc));
			while((line=br.readLine())!= null)
			{
				String[] row = line.split(csvsplit);
				EmployeeTable emp = new EmployeeTable();
				emp.setEmployeeId(Integer.parseInt(row[0]));
				emp.setName(row[1]);
				emp.setManagerId(Integer.parseInt(row[2]));
				empList.add(emp);
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		for(int i=0;i<empList.size();i++){
			System.out.println(empList.get(i).getName());
		}
		
		Map<String,ArrayList<String>> hmap = new HashMap<String,ArrayList<String>>();
		for(int i=0;i<empList.size();i++){
			int c=0;
			int empId=empList.get(i).getEmployeeId();
			ArrayList<String> list = new ArrayList<String>();
			for(int k=0;k<empList.size();k++){
				if(empId == empList.get(k).getManagerId()){
					c++;
					list.add(empList.get(k).getName());
					hmap.put(empList.get(i).getName(), list);
				}
			}
				if(c==0)
				hmap.put(empList.get(i).getName(), new ArrayList<String>());
		}
		System.out.println(hmap);
	}
}
