package com.tcs.oops.Inheritance;

public class InvestmentInstrument {
	private int iiid;//share,bond,deposit
	public InvestmentInstrument(int iiid, String title, String type, double fund) {
		super();
		this.iiid = iiid;
		this.title = title;
		this.type = type;
		this.fund = fund;
	}
	private String title;
	private String type;
	private double fund;
	public int getIiid() {
		return iiid;
	}
	public void setIiid(int iiid) {
		this.iiid = iiid;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public double getFund() {
		return fund;
	}
	public void setFund(double fund) {
		this.fund = fund;
	}
	
	
	
	
	
	

}
