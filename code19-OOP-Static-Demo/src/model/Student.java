package model;

public class Student {

	//instance variables - input
	public String id;
	public String lastName;
	public String firstName;
	public String course;
	public int yearLevel;
	public String subject;
	public int midtermRawGrade;
	public int preFinalRawGrade;
	
	//instance variable - computed
	public double termGrade;
	public String remarks;
	
	//class variable or static variable
	public static int counter; //defaulted to 0
	
	static {
		counter = 5000;
	}
	
	public void computedTermGrade() {
		termGrade = (midtermRawGrade * 0.5 +
				preFinalRawGrade * 0.5);
	}
	
	public void determineRemarks() {
		remarks = (termGrade >= 70)
			? "Passed"
			: "Failed";
	}
}
