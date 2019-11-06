package controller;
import java.io.IOException; 

import model.Student;
import view.Display;
import utility.InputHelper; 

public class AccessStudent {

	public static void main(String[] args)
	throws IOException{
		
		Student student = new Student(); 
		student.id = InputHelper.readString("Enter ID:" );
		student.lastName = InputHelper.readString ("Enter lastname: ");
		student.firstName = InputHelper.readString ("Enter firstname: ");
		student.yearlevel = InputHelper.readInt ("Enter year level: ");
		student.course = InputHelper.readString ("Enter course: ");
		student.midtermRawGrade = InputHelper.readInt ("Enter midterm raw grade: ");
		student.preFinalRawGrade = InputHelper.readInt ("Enter pre final grade: ");

		//perform the computation 
		student.computeTermGrade();
		student.determineRemarks();
		//now print the result 
		Display.printDetails(student);
		System.out.println("\n\n");
		Student student2 = new Student(); 
		student.id = InputHelper.readString("Enter ID:" );
		student.lastName = InputHelper.readString ("Enter lastname: ");
		student.firstName = InputHelper.readString ("Enter firstname: ");
		student.yearlevel = InputHelper.readInt ("Enter year level: ");
		student.course = InputHelper.readString ("Enter course: ");
		student.midtermRawGrade = InputHelper.readInt ("Enter midterm raw grade: ");
		student.preFinalRawGrade = InputHelper.readInt ("Enter pre final grade: ");

		//perform the computation 
		student.computeTermGrade();
		student.determineRemarks();
		//now print the result 
		Display.printDetails(student2);
	}

}
