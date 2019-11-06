package controller;

import java.io.IOException;

import utility.InputHelper;

public class LoopsDemo {

	public static void main(String[] args) 
		throws IOException{
		
		/*int loops = InputHelper.readInt("Enter number "
			+ "of loops to perform: ");
		
		int counter = 1;
		System.out.println("Demo Using While Loop");
		while (counter <= loops) {
			System.out.println(counter+" - while loop");
			counter++;
		}
		
		counter = 1;
		System.out.println("\nDemo Using Do-While Loop");
		do {
			System.out.println(counter+" - do while loop");
			counter++;
		} while (counter <= loops);
		
		System.out.println("\nDemo Using For Loop");
		for (counter = 1; counter <= loops; counter++) {
			System.out.println(counter+" - for loop");
		}
		
		shortest possible Java code for infinite loop
		for (;;) {
			//System.out.println("infinite loop");
		}*/	
		
		int loops = InputHelper.readInt("Enter a number: ");
		
		System.out.println("Listing all ODD numbers");
		int oddNumberCounter = 0;
		for (int counter=0; counter <= loops; counter++) {
			if (counter % 2 == 1) {
				System.out.println(counter);
				oddNumberCounter++;
			}
		}
		System.out.println("There are " + oddNumberCounter
			+ " odd number found.");
	}
}
