package controller;

import java.io.IOException;

import utility.InputHelper;

public class MeralcoExercise {

	public static void main(String[] args) 
		throws IOException{
		getSysOut();
	}	
	
	public static void getSysOut() 
			throws IOException 
			{
			int kwh = InputHelper.readInt("Enter the number of " 
					+ "kilowatt hours consumed: ");	
			System.out.println("Basic electricity charge: Php" + getBasic(kwh)); 
			System.out.println("Basic electricity charge: Php" + getBasic(kwh));
			System.out.println("Excess electricity charge: Php" + getExcess(kwh));
			System.out.println("Gross charge: Php" + getGrossCharge(kwh));
			System.out.println("VAT charge: Php" + getVAT(kwh));
			System.out.println("Total: Php" + getTotal(kwh));
		}
	
	public static double getBasic(int kwh) {
		double charge = 0;
		if (kwh <= 250) {
			charge = kwh * 6.20; 
		} else {
			charge = 250 * 6.20;
		}
		return charge;
	}
	
	public static double getExcess(int kwh) {
		double charge = 0;
		if (kwh > 250) {
			charge = (kwh - 250) * 9.30;
		}
		return charge;
	}
	
	public static double getGrossCharge(int kwh) {
		double grosscharge = 0;
		grosscharge = getBasic(kwh) + getExcess(kwh);
		return grosscharge;
	}
	
	public static double getVAT(int kwh) {
		double VAT = 0;
		VAT = getGrossCharge(kwh) * 0.12;
		return VAT;
	}
	
	public static double getTotal(int kwh) {
		double total = 0;
		total = getGrossCharge(kwh) + getVAT(kwh);
		return total;
	}
}
