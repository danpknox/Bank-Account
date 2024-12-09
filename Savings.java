public class Savings extends BankAcc {
	public double balmin;
	public double interest;
	
	public Savings(String type, int id, double balance, double balmin, double interest) {
		super(type, id, balance);
		this.balmin = balmin;
		this.interest = interest;
	}
	@Override
	public void withdraw(double amt) {
		if(balance - amt >= 0) {
			balance-=amt;
		}
		
	}
	public void monthEnd() {
		balance*=interest;
	}

}
