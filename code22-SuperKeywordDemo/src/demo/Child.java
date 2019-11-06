package demo;

public class Child extends Parent {
	
	public String message =
			"This is the Child class.";
	//this is your default constructor
	//a constructor with no parameters
	public Child() {
		System.out.println("Child without parameter.");
	}
	
	//constructors can be overloaded
	//make sure that the parameters are different
	//in terms of number and/or data type
	public Child (String message) {
		System.out.println("Child with String"
				+ " parameter.");
	}
	
	public Child (int number) {
		this("");
		System.out.println("Child with int"
				+ " parameter.");
	}
	
	public Child (String array[]) {
		System.out.println("Child with String"
				+ " array parameter.");
	}
	
	public Child (String message, int number) {
		super(number);
		System.out.println("Child with String and"
				+ " int parameters.");
	}
	
	public void display() {
		System.out.println("This is inside the Child "
			+ " class.");
		System.out.println(super.message);
		System.out.println(this.message);
	}
}
