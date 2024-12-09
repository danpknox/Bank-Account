public class Checking extends BankAcc {
	public int overdraftCount;
	public int overdraftLimit;
	public double penalty;
	
	public Checking(String type, int id, double balance, double penalty, int overdraftCount, int overdraftLimit) {
		super(type, id,balance);
		this.penalty = penalty;
		this.overdraftCount = overdraftCount;
		this.overdraftLimit = overdraftLimit;
	}
	@Override
	public void withdraw(double amt) {
		if (overdraftCount<overdraftLimit) {
			balance-=amt;
			if (balance<0) {
				balance-=penalty;
				overdraftCount++;
				TotalOverdraftCount++;
			}
		}
		
	}

}
