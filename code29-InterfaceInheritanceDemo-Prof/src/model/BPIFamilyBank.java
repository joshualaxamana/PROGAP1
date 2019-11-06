package model;

public class BPIFamilyBank extends BPI implements 
	PSERequirement {

	public void depositPromo() {
		System.out.println("Free buffet in Spiral one week if you "
			+ "open an account of at least P30,000,000.00 with "
			+ "a dinner date with the new Ms. 2017 Ms. Universe, "
			+ "2017 Ms. World, 2017 Ms. Earth, 2017 Bb. Pilipinas, "
			+ "2017 Ms. Manila, 2017 Ms. CSB, 2017 Ms. IS "
			+ "2017 Ms Java Sophia Hernando");
	}

	public void displayFinancialStatement() {
		System.out.println("PSE Requirement: " 
			+ MIN_LARGE_CAPITALIZATION);
		System.out.println(name + " 2015 "
			+ "Financial Assets: Php355,582,680,566.50");
	}

	public void displayTotalMarketShares() {
		System.out.println("PSE Required Shares: " 
			+ MIN_SHARES_SOLD);
		System.out.println(name + "total shares: " + 
			"3,929,090,393");
	}
}
