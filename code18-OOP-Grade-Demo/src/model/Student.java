package model;

public class Student {

	
	//instance variables - input 
	public String id; 
	public String lastName; 
	public String firstName;
	public String course; 
	public int yearlevel; 
	public String subject;
	public int midtermRawGrade; 
	public int preFinalRawGrade; 
	
	//computed - output
	public double termGrade;
	public String remarks; 
	
	public void computeTermGrade() 
	{
		termGrade = (midtermRawGrade * 0.5 + preFinalRawGrade * 0.5);
	}
	
	public void  determineRemarks()
	{
		remarks = (termGrade >= 70)
		?"Passed"
		:"Failed";
	}
}
