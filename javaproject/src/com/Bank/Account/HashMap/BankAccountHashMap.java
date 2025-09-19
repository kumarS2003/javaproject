package com.Bank.Account.HashMap;

public class BankAccountHashMap {
	
	 private String AccountName;
	 private int AccountNumber;
	 private double balance;
	 
	 public BankAccountHashMap (String accountname, int accountnumber) {
		 
		 this.AccountName = accountname;
		 this.AccountNumber = accountnumber;
		 this.balance = 0.0;
		 
		 
	 }

	 public String getAccountName() {
		 return AccountName;
	 }

	 public void setAccountName(String accountName) {
		 AccountName = accountName;
	 }

	 public int getAccountNumber() {
		 return AccountNumber;
	 }

	 public void setAccountNumber(int accountNumber) {
		 AccountNumber = accountNumber;
	 }

	 public double getBalance() {
		 return balance;
	 }

	 public void setBalance(double balance) {
		 this.balance = balance;
	 }
	
    public void withdraw(double amount) {
    	if (amount <= balance) {
    		
    	}
    }
}
