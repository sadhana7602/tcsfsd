package com.tcs.oops.Inheritance;

public class Bond extends InvestmentInstrument {
	
	private String startdate;
	private String repaydate;
	
	
	public Bond(int iiid, String title, String type, double fund,String startdate,String repaydate) {
		super(iiid, title, type, fund);
		this.startdate=startdate;
		this.repaydate=repaydate;
		
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Bond [startdate=" + startdate + ", repaydate=" + repaydate + ", getIiid()=" + getIiid()
				+ ", getTitle()=" + getTitle() + ", getType()=" + getType() + ", getFund()=" + getFund()
				+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString()
				+ "]";
	}
	
	
	

}
