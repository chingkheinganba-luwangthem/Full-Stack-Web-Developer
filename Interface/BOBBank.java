package Interface;

public  class BOBBank implements ATM1,ATM2{
	
	int totalBal;
	
	@Override
	public void deposit(int amt1) {
		if(amt1> 0) {
			totalBal += amt1;
			System.out.println(amt1 + "deposited Successfully");	
			}
		else {
			System.out.println("Enter valid amount");
		}
		
	}

	@Override
	public void withdraw(int amt2) {
		if(amt2 <= totalBal) {
			totalBal -=amt2;
			System.out.println("Enter valid amount");
			
		}else {
			System.out.println(" Insufficient Balance");
		}
		
	}

	@Override
	public void checkBalance() {
	System.out.println("Available Bal is" + totalBal);
		
	}

}
