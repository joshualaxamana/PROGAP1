package controller;

import java.io.IOException;

import utility.InputHelper;

public class SwitchCharacter {

	public static void main(String[] args) {
		
		char cLetter = 'a';
		
		switch(cLetter) {
			case 'A':
				System.out.println("letter is " + cLetter);
				break;
			case 'a':
				System.out.println("letter is " + cLetter);
				break;
			case 'b':
				System.out.println("letter is " + cLetter);
				break;
			case 'c':
				System.out.println("letter is " + cLetter);
				break;
			default:
				System.out.println("I don't know what letter that is: "
					+ cLetter);
		}

	}

}
