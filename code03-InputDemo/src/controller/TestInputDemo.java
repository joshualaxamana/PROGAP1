package controller;

import java.io.IOException;

import utility.InputHelper;

public class TestInputDemo {

	public static void main(String[] args) 
		throws IOException {
			
			//String name = InputHelper.readString("Enter your name: ");
			//String course = InputHelper.readString("Enter your course: ");
			//int yearLevel = InputHelper.readInt("Enter year level: ");
		
			//System.out.println("\n\nName: " + name);
			//System.out.println("Course: " + course);
			//System.out.println("Year Level: " + yearLevel);
			
			int number = InputHelper.readInt("Enter number: ");
			String message = (number % 2)==1
				? "an odd number" : "an even number";
			System.out.println(number + " is " + message);
	}

}
