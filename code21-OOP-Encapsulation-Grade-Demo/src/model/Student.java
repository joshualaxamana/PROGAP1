package model;

public class Student {

	//instance variables - input
	//encapsulation - data hiding
	private String studentId;
	private String lastName;
	private String firstName;
	private String course;
	private int yearLevel;
	private String subject;
	private int midtermRawGrade;
	private int preFinalRawGrade;
	
	//instance variable - computed
	private double termGrade;
	private String remarks;
	
	public void computedTermGrade() {
		termGrade = (midtermRawGrade * 0.5 +
				preFinalRawGrade * 0.5);
	}
	
	public void determineRemarks() {
		remarks = (termGrade >= 70)
			? "Passed"
			: "Failed";
	}

	public String getStudentId() {
		return studentId;
	}

	public void setStudentId(String studentId) {
		this.studentId = studentId;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getCourse() {
		return course;
	}

	public void setCourse(String course) {
		this.course = course;
	}

	public int getYearLevel() {
		return yearLevel;
	}

	public void setYearLevel(int yearLevel) {
		this.yearLevel = yearLevel;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public int getMidtermRawGrade() {
		return midtermRawGrade;
	}

	public void setMidtermRawGrade(int midtermRawGrade) {
		this.midtermRawGrade = midtermRawGrade;
	}

	public int getPreFinalRawGrade() {
		return preFinalRawGrade;
	}

	public void setPreFinalRawGrade(int preFinalRawGrade) {
		this.preFinalRawGrade = preFinalRawGrade;
	}

	public double getTermGrade() {
		return termGrade;
	}

	public void setTermGrade(double termGrade) {
		this.termGrade = termGrade;
	}

	public String getRemarks() {
		return remarks;
	}

	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}
	

}
