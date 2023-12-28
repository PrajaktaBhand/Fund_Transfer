package com.entity;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="transaction")
public class Transaction {
	
	private long transactionId;
	private double accountNumber;
	private long transactionAmount;
	
	public Transaction() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Transaction(long transactionId, double accountNumber, long transactionAmount) {
		super();
		this.transactionId = transactionId;
		this.accountNumber = accountNumber;
		this.transactionAmount = transactionAmount;
	}

	public long getTransactionId() {
		return transactionId;
	}

	public void setTransactionId(long transactionId) {
		this.transactionId = transactionId;
	}

	public double getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(double accountNumber) {
		this.accountNumber = accountNumber;
	}

	public long getTransactionAmount() {
		return transactionAmount;
	}

	public void setTransactionAmount(long transactionAmount) {
		this.transactionAmount = transactionAmount;
	}

	@Override
	public String toString() {
		return "Transaction [transactionId=" + transactionId + ", accountNumber=" + accountNumber
				+ ", transactionAmount=" + transactionAmount + "]";
	}
	

	
	
}
