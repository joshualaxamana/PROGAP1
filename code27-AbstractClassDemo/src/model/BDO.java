package model;

public class BDO extends BankBSP {

	public String name = "Banco de Oro Unibank Inc.";
	
	public void welcome() {
		System.out.println("Isang pagbati mula sa " + name);
	}
	
	public void depositAmountRequirement() {
		System.out.println("To open an account, "
			+ "minimum deposit amount is P1,000.00");

	}

	public void depositPromo() {
		System.out.println("Minimum opening amount of at least "
			+ "Php1,000,000.00 will get you a signature picture "
			+ "with 2015 Ms.Universe Pia Wurtzbach");

	}

	public void maintaingBalance() {
		System.out.println("Maintaining balance of "
			+ "at least Php500.00 is required");
	}

	public void interestRate() {
		System.out.println("Minimum deposit amount of P3,500.00 "
			+ "to earn an interest rate of 10% per annum");
	}

}
