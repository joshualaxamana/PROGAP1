package model;

public class SECB extends BankBSP {

	public String name = "Security Bank";
	
	public void welcome() {
		System.out.println("Maligayang pagdating sa" + name);
	}
	
	public void depositAmountRequirement() {
		System.out.println("To open an account, "
			+ "minimum deposit amount is P3,000.00");
	}

	public void depositPromo() {
		System.out.println("Minimum opening amount of at least "
			+ "Php500,000.00 will get you a dinner date with "
			+ "2014 Ms.World Megan Young");
	}

	public void maintaingBalance() {
		System.out.println("Maintaining balance of "
			+ "at least Php1,000.00 is required");
	}

	public void interestRate() {
		System.out.println("Minimum deposit amount of P3,500.00 "
			+ "to earn an interest rate of 5% per annum");
	}

}
