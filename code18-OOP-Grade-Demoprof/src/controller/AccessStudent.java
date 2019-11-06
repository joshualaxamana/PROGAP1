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
		
		//now print the result
		Display.printDetails(student);
	}
}







