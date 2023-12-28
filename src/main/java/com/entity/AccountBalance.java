package com.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="AccountBalance")
public class AccountBalance {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long accountId;
	private double accountNumber;
	private double currentBalance;
	
	public AccountBalance() {
		super();
		// TODO Auto-generated constructor stub
	}

	public AccountBalance(long accountId, double accountNumber, double currentBalance) {
		super();
		this.accountId = accountId;
		this.accountNumber = accountNumber;
		this.currentBalance = currentBalance;
	}

	public long getAccountId() {
		return accountId;
	}

	public void setAccountId(long accountId) {
		this.accountId = accountId;
	}

	public double getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(double accountNumber) {
		this.accountNumber = accountNumber;
	}

	public double getCurrentBalance() {
		return currentBalance;
	}

	public void setCurrentBalance(double currentBalance) {
		this.currentBalance = currentBalance;
	}

	@Override
	public String toString() {
		return "AccountBalance [accountId=" + accountId + ", accountNumber=" + accountNumber + ", currentBalance="
				+ currentBalance + "]";
	}

	
	
	
	
	

	
	
	
}
