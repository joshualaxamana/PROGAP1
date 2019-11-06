package controller;

import java.io.IOException;

import utility.InputHelper;

public class SampleIfElseIfDemo {

	public static void main(String[] args) 
		throws IOException {
		
		String faveDay = InputHelper.readString("Enter your "
			+ "favorite day: ").toUpperCase();
		
		if (faveDay.equals("MONDAY")) {
			System.out.println("It is a very exciting Java coding"
				+ " day.");
		} else if (faveDay.equals("TUESDAY")) {
			System.out.println("It is a rest day Tuesday.");
		} else if (faveDay.equals("WEDNESDAY")) {
			System.out.println("It is another very exciting Java coding"
				+ " day. Being a better person.");
		} else if (faveDay.equals("THURSDAY")) {
			System.out.println("It is documentation IT docu day.");
		} else if (faveDay.equals("FRIDAY")) {
			System.out.println("It is study day Java");
		} else if (faveDay.equals("SATURDAY")) {
			System.out.println("It is NSTP day.");
		} else if (faveDay.equals("SUNDAY")) {
			System.out.println("It is family day.");
		} else {
			System.err.println("I do not know what day it is.");
		}
		
	}

}
