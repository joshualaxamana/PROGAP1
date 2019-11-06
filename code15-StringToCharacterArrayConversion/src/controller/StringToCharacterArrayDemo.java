package controller;

import java.io.IOException;

import utility.InputHelper;

public class StringToCharacterArrayDemo {

	public static void main(String[] args) 
		throws IOException, InterruptedException{
		
		String message = InputHelper
			.readString("Enter your message: ");
		
		//now convert the inputed String to a character array
		//the toCharArray() of the String class converts
		//any given String data type into a character array
		//in effect, this is the same as
		//declaration with initialization
		char messageArr[] = message.toCharArray();
		
		//display each character in the character array with
		//text effect of half-second display
		for (char letra : messageArr) {
			System.out.print(letra);
			//the 500 represents a half-second delay
			//in Java 1000 milliseconds means 1 second
			Thread.sleep(500);
		}
	}	
}
