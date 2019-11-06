package controller;

import model.*;
import view.Display;

public class AccessBank {

	public static void main(String[] args) {
		
		//create a BankBSP object
		BankBSP account = new SECB();
		Display.display(account);
		
		account = new BPIFamilyBank();
		Display.display(account);
		
		account = new BDO();
		Display.display(account);
	}
}
