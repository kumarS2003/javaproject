package com.java.Bank.task;

public class Account {
	private double accountNumber;
	private String accountHoldersname;
	private double balance = 0;

	public Account(double accountNumber, String accountHoldersname) {
		super();
		this.accountNumber = accountNumber;
		this.accountHoldersname = accountHoldersname;
		
	}

	public Account(int accountNumber2, String accountHoldersname2) {
		// TODO Auto-generated constructor stub
	}

	public double getAccountNumber() {
		return accountNumber;
	}

	public String getAccountHoldersname() {
		return accountHoldersname;
	}

	public double getBalance() {
	return balance;
  }

	public void deposit(double Amount) throws InvalidAmountException {
	if (Amount  <= 0) {
	throw new InvalidAmountException("Deposit amount must be greater than 0");
	}
		  
  }

	public void withdraw(int i) {
		// TODO Auto-generated method stub
		
	}
}

	