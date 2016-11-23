package com.example.csv;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class GDPCalculator {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		GDPCalculator gdp= new GDPCalculator();
		gdp.GDPCalc();
	}
	
	public void GDPCalc(){
		String loc= "F:/countryGDP.txt";
		String line="";
		String csvsplit=",";
		BufferedReader br=null;
		ArrayList<Country> coun = new ArrayList<Country>();
	
			try {
				br = new BufferedReader(new FileReader(loc));
				while((line=br.readLine())!=null){
					String[] row = line.split(csvsplit);
					/*System.out.println(row[1]);*/
					Country country = new Country();
					country.setCountryName(row[0]);
					country.setCapital(row[1]);
					country.setGdp(Float.parseFloat(row[2]));
					coun.add(country);				
					}
				
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}finally{
				try {
					br.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			System.out.println("The country with Max GDP is :: "+ maxGdp(coun));
			System.out.println("The country with Min GDP is :: "+ minGdp(coun));
			System.out.println("The average GDP of all country is :: "+ avgGdp(coun));
			maxMinComparator(coun);
			}

			public String maxGdp(ArrayList<Country> coun) {
				float max=0;
				String c="";
				Iterator it = coun.iterator();
				while(it.hasNext()){
					Country country = (Country) it.next();
					if(max<country.getGdp()){
						max = country.getGdp();
						c = country.getCountryName();
					}
				}
				return c;
			}
			
			public String minGdp(ArrayList<Country> coun) {
				String c="";
				Iterator it = coun.iterator();
				float min=coun.get(0).getGdp();
				while(it.hasNext()){
					Country country = (Country) it.next();
					if(min>country.getGdp()){
						min = country.getGdp();
						c = country.getCountryName();
					}
				}
				return c;
			}
			
			public float avgGdp(ArrayList<Country> coun) {
				float sum=0;
				for(int i=0;i<coun.size();i++){
					sum+= coun.get(i).getGdp();
				}
				return (sum/coun.size());
			}
			public void maxMinComparator(ArrayList<Country> coun){
				Collections.sort(coun);
				for(Country country: coun){
					System.out.println(country.getGdp());
				}
			}
	}
