package datatypes.demo;

public class DataTypesDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		byte byteNumber = 10;
		short shortNumber = 15;
		int number = 20;
		long longNumber = byteNumber + shortNumber
			+ number;
		
		System.out.println("byte Value: " + byteNumber);
		System.out.println("short value: " + shortNumber);
		System.out.println("int value: " + number);
		System.out.println("Summation value: " + longNumber);
		
		//sample floating-point data types
		float floatNumber = (float) 10.2;
		double PI = 3.14159;
		
		System.out.println("float value: " + floatNumber);
		System.out.println("PI value: " + PI);
		
		boolean isMale = true;
		
		System.out.println("Paolo Ching is " + 
			((isMale)? "male" : "female"));
		
		isMale = false;
		System.out.println("Sophia Hernando is " + 
				((isMale)? "male" : "female"));
		
		boolean isTransmissionAutomatic = false;
		
		number = 65;
		char letterEquivalent = (char) number;
		System.out.println("Letter equivalent of " + number
			+ " is " + letterEquivalent);
		
		String message = "\nASCII Table\n";
		System.out.println(message);
		
		System.out.println("DEC\tSYMBOL");
		for (int counter = 0; counter <=255; counter++) {
			System.out.println(counter + "\t" + (char)counter);
		}

	}

}
