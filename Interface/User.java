package Interface;

public class User {
	public static void main(String []args) {
		ATM1 u1 = new BOBBank();
		u1.checkBalance();
		u1.deposit(1000000);
		u1.checkBalance();
		u1.withdraw(500000);
		u1.checkBalance();
		u1.withdraw(800000);
		u1.checkBalance();
		
		System.out.println("------------------------");
		
		ATM2 u2 = new BOBBank();
		u2.checkBalance();
		u2.deposit(500000);
		u2.checkBalance();
		u2.withdraw(150000);
		u2.checkBalance();
		
		ATM1 u3 = new SBIBank();
	}

}
