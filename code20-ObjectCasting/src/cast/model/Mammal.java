package cast.model;

public class Mammal extends Animal {

	public String type = "Mammal";
	
	public void display() {
		System.out.println("This is the "
			+ type + " class.");
	}
}
