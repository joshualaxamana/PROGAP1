package demo;

public class FinalKeywordDemo {
	public static void main(String[] args) {
		Child child = new Child();
		child.message();
		
		final String school;// = "DLS-CSB the best school - forever.";
		
		school = "DLS-CSB the best school - forever.";
		
	}

}

/*final*/ class Parent {
	public final void message() {
		System.out.println("This is the "
				+ "Parent class.");
	}
}

class Child extends Parent {
	public void message() {
		System.out.println("This is the "
				+ "Child class.");
	}
}