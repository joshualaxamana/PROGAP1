package model;

public class SECB extends BankBSP implements 
	PSERequirement{

	public String name = "Security Bank";
	
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
		"Maligayang pagdating sa " + name;		
	
	public String depositAmountRequirement =
		"To open an account, "
				+ "minimum deposit amount is P3,000.00";

	public String depositPromo = "Minimum opening amount of at least "
			+ "Php500,000.00 will get you a dinner date with "
			+ "2014 Ms. World Megan Young.";

	public String maintainingBalance = 
		"Maintaining balance of "
			+ "at least Php1,000.00 is required";

	public String interestRate 
		 = "Minimum deposit amount of P3,000.00 "
			+ "to earn an interest rate of 5% per annum.";
	
	public String displayFinancialStatement = "PSE Requirement: " 
			+ MIN_LARGE_CAPITALIZATION + "\n" + name + " 2015 "
			+ "Financial Assets: Php141,740,664,644.70";

	public String displayTotalMarketShares = "PSE Required Shares: " 
			+ MIN_SHARES_SOLD + "\n" + name + "total shares: " + 
			"753,538,887";

}
