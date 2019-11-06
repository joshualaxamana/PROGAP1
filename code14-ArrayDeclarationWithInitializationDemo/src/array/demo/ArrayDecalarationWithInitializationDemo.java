package array.demo;

public class ArrayDecalarationWithInitializationDemo {

	public static void main(String[] args) {
		
		int number[] = {10, -5, 100, 26, -15, 50};
		
		String day[] = {"Sunday", "Monday", "Tuesday",
			"Wednesday", "Thursday", "Friday", "Saturday"};
		
		//print all the contents of number using for loop
		//not - the length attribute determines the
		//		size of the specified array
		for (int counter=0; counter < number.length; counter++) {
			System.out.println("number["+counter+"]: "
				+ number[counter]);
		}
		
		//print the content of the day using the new loop
		//that is the enhanced for loop or for each
		System.out.println("Now printing all the days in a "
			+ "week.");
		for (String araw : day) {
			System.out.println(araw);
		}
		
		//based on your integer array, compute the summation
		//values of all number using either while loop or
		//do-while loop
		
		
		//using while loop
		int summation = 0;
		int counter = 0;
		while (counter < number.length) {
			summation+=number[counter];
			counter++;
		}
		System.out.println("The summatin value of the "
			+ "integer array using while loop is " + summation);
		
		//using do-while loop
		summation = 0;
		counter = 0;
		do {
			summation+=number[counter];
			counter++;
		}	while (counter < number.length);
		System.out.println("The summation value of the "
			+ "inteher array using do- while loop is "
			+ summation);
	}
}
