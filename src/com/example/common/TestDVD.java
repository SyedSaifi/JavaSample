package com.example.common;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class TestDVD {
	ArrayList<DVDInfo> dvdlist = new ArrayList<DVDInfo>();
	public static void main(String[] args) {
	new TestDVD().go();
	}
	public void go() {
	populateList();
	System.out.println(dvdlist); // output as read from file
	/*Collections.sort(dvdlist);*/
	/*System.out.println(dvdlist);*/
	GenreSort gs = new GenreSort();
	Collections.sort(dvdlist, gs);
	System.out.println(dvdlist); // output sorted by genre
	}
	
	public void populateList() {
		DVDInfo dvd1= new DVDInfo("Hum Tum", "commedy", "Saif");
		DVDInfo dvd2= new DVDInfo("Delhi Belly", "suspense", "imran");
		DVDInfo dvd3= new DVDInfo("ironman", "action", "downingjr");
		dvdlist.add(dvd1);
		dvdlist.add(dvd2);
		dvdlist.add(dvd3);
		}
}

class GenreSort implements Comparator<DVDInfo> {
	public int compare(DVDInfo one, DVDInfo two) {
			return one.getGenre().compareTo(two.getGenre());
	}
}

class DVDInfo {
String title;
String genre;
String leadActor;


public String getTitle() {
	return title;
}
public void setTitle(String title) {
	this.title = title;
}
public String getGenre() {
	return genre;
}
public void setGenre(String genre) {
	this.genre = genre;
}
public String getLeadActor() {
	return leadActor;
}
public void setLeadActor(String leadActor) {
	this.leadActor = leadActor;
}
DVDInfo(String t, String g, String a) {
	title = t; genre = g; leadActor = a;
	}
	public String toString() {
	return title + " " + genre + " " + leadActor + "\n";
	}
	// getters and setter go here
	}
