package com.psoft.bankingapplication;

import java.util.HashMap;
import java.util.Map;

import com.java.Bank.task.Account;
import com.java.Bank.task.InsufficientFundsException;


public class Bank {
    private Map<Integer, Account> accounts = new HashMap<>();
    private int nextAccountNumber = 11141201;

		public Account createAccount(String holderName, double initialDeposit) throws InvalidAmountException {
			if (initialDeposit < 0) {
				throw new InvalidAmountException("Initial deposit cannot be negative!");
			}
			Account account = new Account(nextAccountNumber++, holderName);
			 accounts.put((int) account.getAccountNumber(), account);
			return account;
		}

		public void deposit(int accountNumber, double amount) throws AccountNotFoundException, InvalidAmountException, com.java.Bank.task.InvalidAmountException {
			Account acc = accounts.get(accountNumber);
			if (acc == null) {
				throw new AccountNotFoundException("Account not found!");
			}
			acc.deposit(amount);
		}

		public void withdraw(int accountNumber, double amount) throws AccountNotFoundException, InvalidAmountException, InsufficientFundsException {
			Account acc = accounts.get(accountNumber);
			if (acc == null) {
				throw new AccountNotFoundException("Account not found!");
			}
			acc.withdraw(amount);
		}

		public void transfer(int fromAcc, int toAcc, double amount) throws AccountNotFoundException, InvalidAmountException, InsufficientFundsException, com.java.Bank.task.InvalidAmountException {
			Account source = accounts.get(fromAcc);
			Account target = accounts.get(toAcc);

			if (source == null) {
				throw new AccountNotFoundException("Source account not found!");
			}
			if (target == null) {
				throw new AccountNotFoundException("Target account not found!");
			}

			source.withdraw(amount);
			target.deposit(amount);
		}

		public double checkBalance(int accountNumber) throws AccountNotFoundException {
			Account acc = accounts.get(accountNumber);
			if (acc == null) {
				throw new AccountNotFoundException("Account not found!");
			}
			return acc.getBalance();
		}

		public void showAllAccounts() {
			if (accounts.isEmpty()) {
				System.out.println("No accounts found!");
			} else {
				for (Account acc : accounts.values()) {
					System.out.println(acc);
				}
			}
		}
	}

