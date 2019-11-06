package controller;

public class ReturnKeywordDemo {

	public static void main(String[] args) {
		int number = 5;
		System.out.println("Value of Number before changeValue: "
			+ number);
		number = changeValue(number);
		System.out.println("Value of Number after changeValue: "
				+ number);
	}
	
	public static int changeValue(int number) {
		number = 10;
		return number;
	}

}
