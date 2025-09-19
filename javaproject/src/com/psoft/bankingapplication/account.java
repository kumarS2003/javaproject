package com.psoft.bankingapplication;

import com.java.Bank.task.InsufficientFundsException;
import com.java.Bank.task.InvalidAmountException;

public class account {
	private int accountNumber;
	private String accountHolder;
	private double balance;

	public void Account(int accountNumber, String accountHolder, double balance) {
		this.accountNumber = accountNumber;
		this.accountHolder = accountHolder;
		this.balance = balance;
	}

	public int getAccountNumber() {
		return accountNumber;
	}

	public String getAccountHolder() {
		return accountHolder;
	}

	public double getBalance() {
		return balance;
	}

	public void deposit(double amount) throws InvalidAmountException {
		if (amount <= 0) {
			throw new InvalidAmountException("Invalid amount! Must be greater than 0.");
		}
		balance += amount;
	}

	public void withdraw(double amount) throws InvalidAmountException, InsufficientFundsException {
		if (amount <= 0) {
			throw new InvalidAmountException("Invalid amount! Must be greater than 0.");
		}
		if (amount > balance) {
			throw new InsufficientFundsException("Insufficient balance!");
		}
		balance -= amount;
	}

	@Override
	public String toString() {
		return "Account [accountNumber=" + accountNumber + ", accountHolder=" + accountHolder + ", balance="
				+ balance + "]";
	}


}

