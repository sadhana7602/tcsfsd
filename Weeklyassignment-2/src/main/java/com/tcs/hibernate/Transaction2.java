package com.tcs.hibernate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Transaction2 {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
		int tid;
		String tranDate;
		double tranAmount;
		int investorId;
		public Transaction2(int tid, String tranDate, double tranAmount, int investorId) {
			super();
			this.tid = tid;
			this.tranDate = tranDate;
			this.tranAmount = tranAmount;
			this.investorId = investorId;
		}
		
		public Transaction2() {
			// TODO Auto-generated constructor stub
		}

		public int getTid() {
			return tid;
		}

		public void setTid(int tid) {
			this.tid = tid;
		}

		public String getTranDate() {
			return tranDate;
		}

		public void setTranDate(String tranDate) {
			this.tranDate = tranDate;
		}

		public double getTranAmount() {
			return tranAmount;
		}

		public void setTranAmount(double tranAmount) {
			this.tranAmount = tranAmount;
		}

		@Override
		public String toString() {
			return "Transaction [tid=" + tid + ", tranDate=" + tranDate + ", tranAmount=" + tranAmount + ", investorId="
					+ investorId + "]";
		}

		public int getInvestorId() {
			return investorId;
		}

		public void setInvestorId(int investorId) {
			this.investorId = investorId;
		}
		

	}



