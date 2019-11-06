package demo;

public class UsingSuperToAttributes {

	public static void main(String args[]) {
		
		new VPOperation().printDetails();
	}
}

class Employee {
	
	public String Name = "Juan dela Cruz";
	int Age = 30;
}

class VPOperation extends Employee {
	
	public void printDetails() {
		System.out.println(super.Name + " "
			+ super.Age);
	}
}