package model;

public class BDO extends BankBSP implements 
	PSERequirement {

	public String name = "Banco de Oro Unibank Inc.";
	
	
	public void welcome() {
		System.out.println(welcome);	
	}
	
	public void depositAmountRequirement() {
		System.out.println(depositAmountRequirement);
	}

	public void depositPromo() {
		System.out.println(depositPromo);
	}

	public void maintainingBalance() {
		System.out.println(maintainingBalance);
	}

	public void interestRate() {
		System.out.println(interestRate);
	}

	public void displayFinancialStatement() {
		System.out.println(displayFinancialStatement);
	}

	public void displayTotalMarketShares() {
		System.out.println(displayTotalMarketShares);
	}

	public String welcome =
			"Isang pagbati mula sa " + name;		
		
	public String depositAmountRequirement =
			"To open an account, "
					+ "minimum deposit amount is P1,000.00";

	public String depositPromo = "Minimum opening amount of at least "
			+ "Php1,000,000.00 will get you a signature picture "
			+ "with 2015 Ms. Universe Pia Wurtzbach.";

	public String maintainingBalance = 
			"Maintaining balance of "
					+ "at least Php500.00 is required";

	public String interestRate 
		 = "Minimum deposit amount of P5,000.00 "
					+ "to earn an interest rate of 10% per annum.";
		
	public String displayFinancialStatement = "PSE Requirement: " 
			+ MIN_LARGE_CAPITALIZATION + "\n" + name + " 2015 "
			+ "Financial Assets: Php408,738,628,256.00";

	public String displayTotalMarketShares = "PSE Required Shares: " 
			+ MIN_SHARES_SOLD + "\n" + name + "total shares: " + 
				"3,649,452,038";
}
