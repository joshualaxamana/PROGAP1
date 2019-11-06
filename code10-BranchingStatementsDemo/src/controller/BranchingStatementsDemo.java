package controller;

import java.io.IOException;

import utility.InputHelper;

public class BranchingStatementsDemo {

	public static void main(String[] args)
		throws IOException {
		
		int loops = InputHelper.readInt("Enter a number: ");
		
		/*for (int counter=1; counter <= loops; counter++) {
			System.out.println(counter);
			if (counter == 5) {
				break;
			}
		}*/
	
		for (int counter=1; counter <= loops; 
			counter++) {
			
			if (counter == 5) {
				continue;
			}
			System.out.println(counter);
		}
	}

}
