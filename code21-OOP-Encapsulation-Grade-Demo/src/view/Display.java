package view;

import model.Student;

public class Display {

	public static void printDetails(Student student){
		System.out.println("Student Details");
		System.out.println("----------------");
		System.out.println("ID: " + student.getStudentId());
		System.out.println("Name: " + student.getLastName() + ", "
			+ student.getFirstName());
		System.out.println("Course: " + student.getCourse());
		System.out.println("Year Level: " + student.getYearLevel());
		System.out.println("Midterm Raw Score: " + student.getMidtermRawGrade());
		System.out.println("Pre-Final Raw Score: " + student.getPreFinalRawGrade());
		System.out.println("Term Grade: " + student.getTermGrade());
		System.out.println("Remarks: " + student.getRemarks());
		
	}
}
