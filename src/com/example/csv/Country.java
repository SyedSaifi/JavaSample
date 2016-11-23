package com.example.csv;

public class Country implements Comparable<Country>{
	private String countryName;
	private String capital;
	private float gdp;
	public String getCountryName(){
		return countryName;
	}
	public void setCountryName(String countryName) {
		this.countryName = countryName;
	}
	public String getCapital() {
		return capital;
	}
	public void setCapital(String capital) {
		this.capital = capital;
	}
	public float getGdp() {
		return gdp;
	}
	public void setGdp(float gdp) {
		this.gdp = gdp;
	}
	@Override
	public int compareTo(Country o) {
		if(this.getGdp()>o.getGdp())
			return 1;
		else if(this.getGdp()<o.getGdp())
			return -1;
		else
			return 0;
	}
	
	
}
