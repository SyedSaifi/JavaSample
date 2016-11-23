package com.oracle.interview;

import java.util.Scanner;

public class TowersOfHanoi {

	   public void solve(int n, String from, String inter, String to) {
	       if (n == 1) {
	           System.out.println("Disk 1 from "+from + " -> " + to);
	       } else {
	           solve(n - 1, from, to, inter);
	           System.out.println("Disk "+n+" from "+from + " -> " + to);
	           solve(n - 1, inter, from, to);
	       }
	   }

	   public static void main(String[] args) {
	       TowersOfHanoi towersOfHanoi = new TowersOfHanoi();
	       System.out.print("Enter number of discs: ");
	       Scanner scanner = new Scanner(System.in);
	       int discs = scanner.nextInt();
	       towersOfHanoi.solve(discs, "A", "B", "C");
	   }
	}
