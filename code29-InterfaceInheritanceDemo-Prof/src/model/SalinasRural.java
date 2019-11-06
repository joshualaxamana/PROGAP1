package model;

public class SalinasRural extends BankBSP {

	public String name = "Salinas Rural Bank";
	
	public void welcome() {
		System.out.println("Maligayang pagdating sa " + name);		
	}
	
	public void depositAmountRequirement() {
		System.out.println("To open an account, "
			+ "minimum deposit amount is P100.00");
	}

	public void depositPromo() {
		System.out.println("Opening an account of "
			+ "at least Php2,000.00 will get you "
			+ "a lot in Ayala Alabang (nasa paso).");
	}

	public void maintainingBalance() {
		System.out.println("Maintaining balance of "
			+ "at least Php1.00 is required");
	}

	public void interestRate() {
		System.out.println("Minimum deposit amount of P100.00 "
			+ "to earn an interest rate of 5% per annum.");
	}

}
