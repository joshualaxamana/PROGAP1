package controller;

import java.io.IOException;

import model.Student;
import view.Display;
import utility.InputHelper;

public class AccessStudent {

	public static void main(String[] args) 
		throws IOException{
		
		//create an object of Student
		Student student = new Student();
		student.id = InputHelper.readString("Enter ID: ");
		student.lastName = InputHelper.readString("Enter lastname: ");
		student.firstName = InputHelper
			.readString("Enter firstname: ");
		student.yearLevel = InputHelper.readInt("Enter year level:");
		student.course = InputHelper.readString("Enter course: ");
		student.midtermRawGrade = 
			InputHelper.readInt("Enter midterm raw score:");
		student.preFinalRawGrade = 
				InputHelper.readInt("Enter pre-final raw score:");

		//now perform the computation
		student.computeTermGrade();
		student.determineRemarks();
		student.counter++;
		
		//now let us the test the meaning of instance variables
		//having unique values from other object 
		//create an object of Student
		Student student2 = new Student();
		student2.id = InputHelper.readString("Enter ID: ");
		student2.lastName = InputHelper.readString("Enter lastname: ");
		student2.firstName = InputHelper
			.readString("Enter firstname: ");
		student2.yearLevel = InputHelper.readInt("Enter year level:");
		student2.course = InputHelper.readString("Enter course: ");
		student2.midtermRawGrade = 
			InputHelper.readInt("Enter midterm raw score:");
		student2.preFinalRawGrade = 
				InputHelper.readInt("Enter pre-final raw score:");

		//now perform the computation
		student2.computeTermGrade();
		student2.determineRemarks();
		student2.counter++;
		
		//create the 3rd student object
		Student student3 = new Student();
		student3.id = InputHelper.readString("Enter ID: ");
		student3.lastName = InputHelper.readString("Enter lastname: ");
		student3.firstName = InputHelper
			.readString("Enter firstname: ");
		student3.yearLevel = InputHelper.readInt("Enter year level:");
		student3.course = InputHelper.readString("Enter course: ");
		student3.midtermRawGrade = 
			InputHelper.readInt("Enter midterm raw score:");
		student3.preFinalRawGrade = 
				InputHelper.readInt("Enter pre-final raw score:");

		//now perform the computation
		student3.computeTermGrade();
		student3.determineRemarks();
		student3.counter++;
		
		//now print the result
		//Display.printDetails(student);
		
		System.out.println("\n");
		
		//now print the result
		//Display.printDetails(student2);
		
		System.out.println("Total Students: " 
			+ (student.counter + student2.counter 
			+ student3.counter));
		
		
	}
}







