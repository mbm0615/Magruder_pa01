package src;
public class SavingAccountTest {

	public static void main(String[] args) {
		SavingsAccount saver1 = new SavingsAccount(2000);
		SavingsAccount saver2 = new SavingsAccount(3000);
		
		// Sets interest to 4%
		SavingsAccount.modifyInterestRate(0.04);
		
		// Calculates monthly interest over a year
		for (int i = 0; i < 12; i++)
		{
			saver1.calculateMonthlyInterest();
			saver2.calculateMonthlyInterest();
			
		}
		System.out.printf("Saver1's balance is $%.2f\n", saver1.getSavingsBalance());
		System.out.printf("Saver2's balance is $%.2f\n", saver2.getSavingsBalance());
		// Sets interest to 5%
		SavingsAccount.modifyInterestRate(0.05);
		
		// Calculates next month's interest
		saver1.calculateMonthlyInterest();
		saver2.calculateMonthlyInterest();
		
		// Prints out balances for saver1 and saver2
		System.out.printf("Saver1's balance is $%.2f\n", saver1.getSavingsBalance());
		System.out.printf("Saver2's balance is $%.2f\n", saver2.getSavingsBalance());
	}
}


