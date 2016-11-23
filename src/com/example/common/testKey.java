package com.example.common;

public class testKey {
	private int length;
	private int breath;
	
	public testKey(int length, int breath){
		this.length=length;
		this.breath=breath;
	}

	@Override
	public int hashCode(){
		int hash = this.length + this.breath;
		 return hash;
	}
	
	@Override
	public boolean equals(Object o){
		if(this.length == ((testKey)o).getLength() && this.breath == ((testKey)o).getBreath()){
			return true;
		}else
			return false;
	}

	public int getLength() {
		return length;
	}

	public void setLength(int length) {
		this.length = length;
	}

	public int getBreath() {
		return breath;
	}

	public void setBreath(int breath) {
		this.breath = breath;
	}
}
