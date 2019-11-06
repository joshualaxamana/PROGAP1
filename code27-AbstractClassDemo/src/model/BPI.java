package model;

public abstract class BPI extends BankBSP {

	public String name = "Bank of the Philippine Islands";
	
	public void welcome() {
		System.out.println("Welcome to " + name);
	}
	
	public void depositAmountRequirement() {
		System.out.println("To open an account, "
			+ "minimum deposit amount is P5,000.00");
	}

	public void maintaingBalance() {
		System.out.println("Maintaining balance of "
			+ "at least Php2,000.00 is required");
	}

	public void interestRate() {
		System.out.println("Minimum deposit amount of P3,500.00 "
			+ "to earn an interest rate of 1.5% per annum");
	}

}
