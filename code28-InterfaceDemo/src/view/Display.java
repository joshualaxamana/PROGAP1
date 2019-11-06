package view;

import model.*;

public class Display {

	public static void display(BankBSP bank) {
		if (bank instanceof SECB) {
			SECB account = (SECB) bank;
			account.welcome();
			account.depositAmountRequirement();
			account.depositPromo();
			account.maintaingBalance();
			account.interestRate();
			account.displayFinancialStatement();
			account.displayTotalMarketShares();
		} else if (bank instanceof BPIFamilyBank) {
			BPIFamilyBank account = (BPIFamilyBank) bank;
			account.welcome();
			account.depositAmountRequirement();
			account.depositPromo();
			account.maintaingBalance();
			account.interestRate();
			account.displayFinancialStatement();
			account.displayTotalMarketShares();
		} else if (bank instanceof BDO) {
			BDO account = (BDO) bank;
			account.welcome();
			account.depositAmountRequirement();
			account.depositPromo();
			account.maintaingBalance();
			account.interestRate();
			account.displayFinancialStatement();
			account.displayTotalMarketShares();
		} 
	}
}
