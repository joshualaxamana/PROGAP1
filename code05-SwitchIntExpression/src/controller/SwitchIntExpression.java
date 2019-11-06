package controller;

import java.io.IOException;

import utility.InputHelper;

public class SwitchIntExpression {

	public static void main(String[] args) {
		
		int iGrade = 90;
		
		switch(iGrade) {
		case 100:
			System.out.println("Excellent!");
			break;
		case 90:
			System.out.println("Good job!");
			break;
		case 80:
			System.out.println("Study harder!");
			break;
		default:
			System.out.println("Sorry, you failed.");
		}
	}
}
