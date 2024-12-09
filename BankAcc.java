public class BankAcc {
	public String type;
	public int id;
	public double balance;
	public static int TotalOverdraftCount;
	public static int overdraftGlobalLimit;
	
	public BankAcc(String type, int id, double balance) {
		this.type = type;
		this.id = id;
		this.balance = balance;
	}
	
	public void deposit(double amt) {
		balance+=amt;
	}
	public void withdraw(double amt) {
		balance-=amt;
	}

}
