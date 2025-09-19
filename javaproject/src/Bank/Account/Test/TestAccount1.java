package Bank.Account.Test;

public class TestAccount1 {
	public static void main(String[] args) {
		
		Account a1 = new Account("malli" , 10001);
		Account a2 = new Account("mahesh", 10002);
		Account a3 = new Account ("sravani", 10003);
		Account a4 = new Account ("sumathi", 10004);
	 
		//deposit monety
		a1.deposit(10000);
		a2.deposit(15000);
		a3.deposit(20000);
		a4.deposit(5000);
		
		System.out.println(a1);
		System.out.println(a2);
		System.out.println(a3);
		System.out.println(a4);
		
		System.out.println(              );
		
		// withdraw money
		a1.withdraw(5000);
		a2.withdraw(7000);
		a3.withdraw(10000);
		a4.withdraw(2500);
		
		System.out.println(a1);
		System.out.println(a2);
		System.out.println(a3);
		System.out.println(a4);
		
		
	}


}
