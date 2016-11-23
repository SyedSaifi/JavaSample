package com.example.markerInterface;

public class MainClass {
	   public static void main(String[] args) {
	         Payment p = new Payment();
	           
	         if (p instanceof Cheque) {
	             p.paymentByCheque();
	         }
	             
	         if (p instanceof BankDraft) {
	              p.paymentByBankDraft ();
	         }
	   }
	}