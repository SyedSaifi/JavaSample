package com.example.markerInterface;

public class Payment implements BankDraft {
	public void paymentByCheque() {
	       System.out.println("Payment By Cheque");
	   }
	       
	   public void paymentByBankDraft() {
	       System.out.println("Payment by Draft");
	   }
}
