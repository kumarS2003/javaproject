package Bank.Account.Test;



	class Account{
		private String AccountName;
		private int AccountNumber;
		private double balance;
		
		public Account(String name, int number) {
			
			this.AccountName = name;
			this.AccountNumber = number;
			this.balance = 0.0;
			}

		public String getAccountName() {
			return AccountName;
		}

		

		public int getAccountNumber() {
			return AccountNumber;
		}

		
		public double getBalance() {
			return balance;
		}

		//Deposit method
		public void deposit(double amount) {
			balance += amount;
		}
			//withdraw method
			public void withdraw(double amount) {
				if (amount <= balance) {
				balance -= amount;
				
			}
			
			else
			{
				System.out.println("Not engouh balance!");
			}
			}

		@Override
		public String toString() {
			return "Account [AccountName=" + AccountName + ", AccountNumber=" + AccountNumber + ", balance=" + balance
					+ "]";
		}
		
		
		
		
	}