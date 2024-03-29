package model;

public class BPIFamilyBank extends BPI implements 
	PSERequirement {


	public String welcome =
			"Welcome to " + name;		
		
		public String depositAmountRequirement =
			"To open an account, "
					+ "minimum deposit amount is P5,000.00";

		public String depositPromo = "Free buffet in Spiral one week if you "
				+ "open an account of at least P30,000,000.00 with "
				+ "a dinner date with the new Ms. 2017 Ms. Universe, "
				+ "2017 Ms. World, 2017 Ms. Earth, 2017 Bb. Pilipinas, "
				+ "2017 Ms. Manila, 2017 Ms. CSB, 2017 Ms. IS "
				+ "2017 Ms Java Sophia Hernando";

		public String maintainingBalance = 
			"Maintaining balance of "
				+ "at least Php2,000.00 is required";

		public String interestRate 
			 = "Minimum deposit amount of P3,500.00 "
						+ "to earn an interest rate of 1.5% per annum.";
		
		public String displayFinancialStatement = "PSE Requirement: " 
				+ MIN_LARGE_CAPITALIZATION + "\n" + name + " 2015 "
				+ "Financial Assets: Php355,582,680,566.50";

		public String displayTotalMarketShares = "PSE Required Shares: " 
				+ MIN_SHARES_SOLD + "\n" + name + "total shares: " + 
				"3,929,090,393";
		
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

}
