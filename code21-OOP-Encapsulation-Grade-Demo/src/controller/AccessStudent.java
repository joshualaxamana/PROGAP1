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
		student.setStudentId(InputHelper.readString("Enter ID: "));
		student.setLastName(InputHelper.readString("Enter lastname: "));
		student.setFirstName(InputHelper.readString("Enter firstname: "));
		student.setYearLevel(InputHelper.readInt("Enter year level: "));
		student.setCourse(InputHelper.readString("Enter course: "));	
		student.setMidtermRawGrade(InputHelper.readInt("Enter midterm raw score: "));
		student.setPreFinalRawGrade(InputHelper.readInt("Enter pre-final raw score: "));
		
		//create on object of Student
		Student student2 = new Student();
		student2.setStudentId(InputHelper.readString("Enter ID: "));
		student2.setLastName(InputHelper.readString("Enter lastname: "));
		student2.setFirstName(InputHelper.readString("Enter firstname: "));
		student2.setYearLevel(InputHelper.readInt("Enter year level: "));
		student2.setCourse(InputHelper.readString("Enter course: "));	
		student2.setMidtermRawGrade(InputHelper.readInt("Enter midterm raw score: "));
		student2.setPreFinalRawGrade(InputHelper.readInt("Enter pre-final raw score: "));
		
		
		//now perform the computation
		student.computedTermGrade();
		student.determineRemarks();
		
		//now perform the computation
		student2.computedTermGrade();
		student2.determineRemarks();
		
		//now print the result
		Display.printDetails(student);
		
		System.out.println("\n");
		
		//now print the result
		Display.printDetails(student2);
	}

}
