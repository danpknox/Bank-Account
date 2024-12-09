import java.util.*;


public class BankAccTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<BankAcc> accs = new ArrayList<BankAcc>();
		BankAcc acc1 = new Savings("savings", 111, 1500.50, 100, 1.03);
		BankAcc acc2 = new Savings("savings", 222, 2000.75, 500, 1.05);
		BankAcc acc3 = new Checking("checkings", 333, 300.25, 50, 0, 5);
		BankAcc acc4 = new Checking("checkings", 444, 500, 50, 2, 2);
		BankAcc acc5 = new CD("CD", 555, 10000.05, 2000, 1.01, 1, 10, 25);
		BankAcc acc6 = new CD("CD", 666, 7500, 1000, 1.02, 1, 10, 20);
		
		((Savings)acc1).monthEnd();
		((Savings)acc2).withdraw(100);
		((Checking)acc3).withdraw(305);
		((Checking)acc4).withdraw(600);
		((CD)acc5).withdraw(10);
		
		accs.add(acc1);
		accs.add(acc2);
		accs.add(acc3);
		accs.add(acc4);
		accs.add(acc5);
		accs.add(acc6);
		
		System.out.printf("%-20s%-20s%-20s%-20s%-20s%-20s%-20s%-20s\n", "Type", "ID", "Balance","BalMin", "Interest", "penalty", "age", "maturity");
		for (BankAcc a:accs) {
			System.out.printf("%-20s%-20d%-20.2f", a.type, a.id, ((BankAcc)a).balance);
			
			if (a instanceof Savings) {
				if (a instanceof CD) {
					System.out.printf("%-20.2f%-20.2f%-20s%-20d%-20d\n", ((CD)a).balmin, ((CD)a).interest, "", ((CD)a).age, ((CD)a).maturity);
				}
				else {
					System.out.printf("%-20.2f%-20.2f\n", ((Savings)a).balmin, ((Savings)a).interest);
				}
				
			}
			else if (a instanceof Checking) {
				System.out.printf("%-20s%-20s%-20.2f\n", "", "", ((Checking)a).penalty);
				
			}
			
			else {
				
			}
			
		}
		

	}
