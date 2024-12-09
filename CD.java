public class CD extends Savings{
	public int age;
	public int maturity;
	public int penalty;
	
	public CD(String type, int id, double balance, double balmin, double interest, int age, int maturity, int penalty) {
		super(type, id, balance, balmin, interest);
		this.age = age;
		this.maturity = maturity;
		this.penalty = penalty;
	}
	@Override
	public void withdraw(double amt) {
		if(balance - amt >= 0) {
			balance-=amt;
		}
		if(age<maturity) {
			balance-=penalty;
		}
	}

}
