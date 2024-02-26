package com.tcs.inheritance3;


public class AddOnVisaDebitCard extends Card {

	public AddOnVisaDebitCard() {
		super();
		// TODO Auto-generated constructor stub
	}

	public AddOnVisaDebitCard(int cardNo, String expiry, int cvy, String name, int pin, double amount) {
		super(cardNo, expiry, cvy, name, pin, amount);
		// TODO Auto-generated constructor stub
	}

	@Override
	public boolean swipe(double transactionAmount) {
		// TODO Auto-generated method stub
		System.out.println("transaction successfull from add on debit card");
		return true;
	}

}
