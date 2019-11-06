package controller;

import java.io.IOException;

import utility.InputHelper;

public class HandsOnExercise {


	public static void main(String[] args) 
		throws IOException {
		
		int Hours = InputHelper.readInt("Enter hours "
				+ "worked: ");
		int Rate = InputHelper.readInt("Enter rate "
				+ "per hour: ");
		
		int Gross = Hours * Rate;
		System.out.println("Gross pay: PHP" + Gross);
		
		if(Gross < 5000){
			double Tax = Gross * 0.05;
			System.out.println("Withholding Tax Deduction: PHP" + Tax);
			System.out.println("SSS Deduction: PHP1000");
			System.out.println("HDMF Deduction: PHP500");
			double Net = Gross - (Tax + 1000 + 500);
			System.out.println("NetPay: PHP" + Net);
		} else if (Gross < 8000) {
			double Tax = Gross * 0.07;
			System.out.println("Withholding Tax Deduction: PHP" + Tax);
			System.out.println("SSS Deduction: PHP1000");
			System.out.println("HDMF Deduction: PHP500");
			double Net = Gross - (Tax + 1000 + 500);
			System.out.println("NetPay: PHP" + Net);
		} else if (Gross < 10000) {
			double Tax = Gross * 0.09;
			System.out.println("Withholding Tax Deduction: PHP" + Tax);
			System.out.println("SSS Deduction: PHP1000");
			System.out.println("HDMF Deduction: PHP500");
			double Net = Gross - (Tax + 1000 + 500);
			System.out.println("NetPay: PHP" + Net);
		} else if (Gross >= 10000) {
			double Tax = Gross * 0.15;
			System.out.println("Withholding Tax Deduction: PHP" + Tax);
			System.out.println("SSS Deduction: PHP1000");
			System.out.println("HDMF Deduction: PHP500");
			double Net = Gross - (Tax + 1000 + 500);
			System.out.println("NetPay: PHP" + Net);
		} else {
			System.err.println("Please input correct value");
		}
		
	}

}
