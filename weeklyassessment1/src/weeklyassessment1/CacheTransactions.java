package weeklyassessment1;
 
import java.util.*;

 
public class CacheTransactions {
	
	
	
	
	ArrayList<Investor> inv = new ArrayList<>();
	ArrayList<Transaction> transactions = new ArrayList();
	public boolean addTransaction(Transaction t) {
		boolean flag =false;
		Investor i1= new Investor(1,"abc","chennai",50000,"shares");
		Investor i2= new Investor(2,"def","cbe",10000,"bonds");
		Investor i3= new Investor(3,"yuj","ooty",70000,"deposit");
		Investor i4= new Investor(4,"nkjh","delhi",60000,"deposit");
		Investor i5= new Investor(5,"def","kovai",1090,"bonds");
		
		inv.add(i5);
		inv.add(i4);
		inv.add(i3);
		inv.add(i2);
		inv.add(i1);
		for(Investor i:inv) {
			if(t.getInvestorId()==i.getId()) {
				 flag= true;
				}
			}
		if(flag) {
			transactions.add(t);
		}
		
		return flag;
		
	}
	public void showTransaction() {
		/*for(Transcation i:transactions) {
			System.out.println(transactions);
		}*/
		Iterator<Transaction> iter = transactions.iterator();
		while(iter.hasNext()) {
			Transaction t = iter.next();
			System.out.println(t);
		}
	}
	public Transaction showGivenTransaction(int tranId) {
		Transaction temp = null;
		for(Transaction i:transactions) {
			if(i.getTid() == tranId)
				temp = i;
		}
		return temp;
	}
	//update Transaction
	public Transaction updateTransaction(int tranId,double tranamount) {
		Transaction temp = null;
		for(Transaction i:transactions) {
		    if(i.getTid()==tranId)
		    	i.setTranAmount(tranamount);
		    	temp = i;
		}
		return temp;
	}
 
}

