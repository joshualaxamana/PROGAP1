package demo.array;

public class ArrayDemo {

	public static void main(String[] args) {
		
		//example array declaration
		int number[] = new int[10];
		
		char content[] = new char[5];
		
		String day[] = new String[7];
		
		// place some values into these arrays
		number[2] = 15;
		number[4] = 20;
		System.out.println("The summation of " + number[2]
			+ " and " + number[4] + " is " + (number[2]
			+ number[4]));
		
		content[0] = 'C';
		content[1] = 'S';
		content[2] = 'B';
		content[3] = '.';
		
		System.out.println("Our school is DLS-"
			+ content[0] + content[1] + content[2]
			+ content[3]);
		
		day[1] = "Monday - Java coding day";
		
		System.out.println("Day today: " + day[1]);
	}

}
