package src;
public class SavingsAccount {
	private static double annualInterestRate;
	private double savingsBalance;
	public SavingsAccount(double s)
	{
		setSavingsBalance(s);
	}
	
	// Sets annualInterestRate
	public static void modifyInterestRate(double rate)
	{
		annualInterestRate = rate;
	}
	// Calculates a months worth of interest
	public double calculateMonthlyInterest()
	{
		savingsBalance += (savingsBalance * (annualInterestRate/12.0)) ;
		return(savingsBalance);
	}
	// Sets savingsBalance
	public void setSavingsBalance(double balance)
	{
		if (balance < 0)
		{
			System.out.println("inncorrect ballance.");
			return;
		}
		savingsBalance = balance;
	}
	// Returns savingsBalance
	public double getSavingsBalance()
	{
		return savingsBalance;
	}
}

