package com.tcs.inheritance;

public class CardTransactions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HDFCVisaDebitCard hdfc =
				new HDFCVisaDebitCard(12345,"03/25",919,"sadhana",4536,500000);
		
		System.out.println(hdfc);
		
		ICICIMasterCreditCard icici =
				new ICICIMasterCreditCard(898989,"02/27",909,"kavi",8989,200000);
		
		hdfc.swipe(100000);
		icici.swipe(2300);
		
		Card card =
				new HDFCVisaDebitCard(12345,"03/25",919,"sadhana",4536,500000);
		card.swipe(250000);
		card=new ICICIMasterCreditCard(898989,"02/27",909,"kavi",8989,200000);
		card.swipe(15000);
	
	}

}
