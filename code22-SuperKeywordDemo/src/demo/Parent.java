package demo;

public class Parent {

	public String message =
			"This is the Parent class.";
	//this is your default constructor
	//a constructor with no parameters
	public Parent() {
		System.out.println("Parent without parameter.");
	}
	
	//constructors can be overloaded
	//make sure that the parameters are different
	//in terms of number and/or data type
	public Parent (String message) {
		System.out.println("Parent with String"
				+ " parameter.");
	}
	
	public Parent (int number) {
		this("");
		System.out.println("Parent with int"
				+ " parameter.");
	}
	
	public Parent (String array[]) {
		System.out.println("Parent with String"
				+ " array parameter.");
	}
	
	public Parent (String message, int number) {
		System.out.println("Parent with String and"
				+ " int parameters.");
	}
	
	//normal method and non-constructor
	public void display() {
		System.out.println("This is inside the Parent "
			+ " class.");
	}
}
