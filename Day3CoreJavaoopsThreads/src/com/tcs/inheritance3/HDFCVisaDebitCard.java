package com.tcs.inheritance3;

public class HDFCVisaDebitCard extends Card {
	
	
	
	public HDFCVisaDebitCard() {
		super();
		// TODO Auto-generated constructor stub
	}

	public HDFCVisaDebitCard(int cardNo, String expiry, int cvy, String name, int pin, double amount) {
		super(cardNo, expiry, cvy, name, pin, amount);
		// TODO Auto-generated constructor stub
	}

	@Override
	public boolean swipe(double transactionAmount) {
		// TODO Auto-generated method stub
		//first get the balcance from account
		//based on cardno of the customer
		//update the account balance with transaction amount
		System.out.println("Transaction successfull from hdfc");
		return true;
	}
}
