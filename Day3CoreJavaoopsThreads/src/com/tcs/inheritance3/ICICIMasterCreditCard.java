package com.tcs.inheritance3;

public class ICICIMasterCreditCard extends Card {

	public ICICIMasterCreditCard() {
		super();
		// TODO Auto-generated constructor stub
	}

	public ICICIMasterCreditCard(int cardNo, String expiry, int cvy, String name, int pin, double amount) {
		super(cardNo, expiry, cvy, name, pin, amount);
		// TODO Auto-generated constructor stub
	}
   @Override
   public boolean swipe(double transactionAmount) {
	// TODO Auto-generated method stub
	// TODO Auto-generated method stub
			//first get the balcance from account
			//based on cardno of the customer
			//update the account balance with transaction amount
	   		System.out.println("Transaction successfull from icici");
			return true;
   }
}
