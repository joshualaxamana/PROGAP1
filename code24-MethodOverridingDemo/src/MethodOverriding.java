
public class MethodOverriding {

	public static void main(String[] args) {
		
		Child child = new Child();
		child.printMessage();
	}
}

class Parent {
	
	public void printMessage() {
		System.out.println("this is a parent message");
	}
}

class Child extends Parent {
	
	public void printMessage() {
		System.out.println("this is a child message");
	}
}
