package com.psoft.bankingapplication;

import java.util.Scanner;

import com.java.Bank.task.Account;

public class User {
	
		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			Bank bank = new Bank();

			while (true) {
				System.out.println("\n===== Bank Menu =====");
				System.out.println("1. Create Account");
				System.out.println("2. Deposit");
				System.out.println("3. Withdraw");
				System.out.println("4. Transfer");
				System.out.println("5. Check Balance");
				System.out.println("6. Show All Accounts");
				System.out.println("7. Exit");
				System.out.print("Enter choice: ");

				int choice = sc.nextInt();

				try {
					switch (choice) {
					case 1:
						System.out.println("Enter account holder name: ");
						sc.nextLine(); // consume newline
						String name = sc.nextLine();
						System.out.print("Enter initial deposit: ");
						double initDeposit = sc.nextDouble();
						Account acc = bank.createAccount(name, initDeposit);
						System.out.println("Account created successfully! Account Number: " + acc.getAccountNumber());
						break;

					case 2:
						System.out.print("Enter account number: ");
						int depAcc = sc.nextInt();
						System.out.print("Enter deposit amount: ");
						double depAmount = sc.nextDouble();
						bank.deposit(depAcc, depAmount);
						System.out.println("Deposit successful!");
						break;

					case 3:
						System.out.print("Enter account number: ");
						int wAcc = sc.nextInt();
						System.out.print("Enter withdraw amount: ");
						double wAmount = sc.nextDouble();
						bank.withdraw(wAcc, wAmount);
						System.out.println("Withdrawal successful!");
						break;

					case 4:
						System.out.print("Enter source account number: ");
						int from = sc.nextInt();
						System.out.print("Enter target account number: ");
						int to = sc.nextInt();
						System.out.print("Enter transfer amount: ");
						double tAmount = sc.nextDouble();
						bank.transfer(from, to, tAmount);
						System.out.println("Transfer successful!");
						break;

					case 5:
						System.out.print("Enter account number: ");
						int balAcc = sc.nextInt();
						double balance = bank.checkBalance(balAcc);
						System.out.println("Balance: " + balance);
						break;

					case 6:
						bank.showAllAccounts();
						break;

					case 7:
						System.out.println("Thank you for using the Bank Application!");
						sc.close();
						return;

					default:
						System.out.println("Invalid choice! Please try again.");
					}
				} catch (Exception e) {
					System.out.println("Error: " + e.getMessage());
				}
			}
		}
	}
