package Bank.Account.Test;

public class Testclass {
 public static void main(String[] args) {
	 
	 Account a1 = new Account("kumar", 1001);
	 Account a2 = new Account("sai", 1002);
	 
	 //diposit method 
	 
	 a1.deposit(10000);
	 a2.deposit(5000);
	 
	 //withdraw method
	 a1.withdraw(3000);
	 a2.withdraw(1000);
	 
	 System.out.println(a1);
	 System.out.println(a2);
}
}
