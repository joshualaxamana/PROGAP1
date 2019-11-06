package view;

import model.Student;

public class Display {

	public static void printDetails(Student student){
		System.out.println("Student Details");
		System.out.println("----------------");
		System.out.println("ID: " + student.id);
		System.out.println("Name: " + student.lastName + ", "
			+ student.firstName);
		System.out.println("Course: " + student.course);
		System.out.println("Year Level: " + student.yearLevel);
		System.out.println("Midterm Raw Score: " + student.midtermRawGrade);
		System.out.println("Pre-Final Raw Score: " + student.preFinalRawGrade);
		System.out.println("Term Grade: " + student.termGrade);
		System.out.println("Remarks: " + student.remarks);
		
	}
}
