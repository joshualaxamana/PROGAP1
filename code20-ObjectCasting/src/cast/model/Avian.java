package cast.model;

public class Avian extends Animal {
	
	public String type = "Avian";
	
	public void display() {
		System.out.println("This is the "
			+ type + " class.");
	}
}
