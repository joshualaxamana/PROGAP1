package utility;

import java.io.*;

public class InputHelper {

	//this function gets a BufferedReader object
	//System.in means a default input that means a keyboard entry
	private static BufferedReader getReader() {
		BufferedReader reader = new BufferedReader(
			new InputStreamReader(System.in));
		return reader;
	}
	
	//this function reads a String input value
	public static String readString(String message) 
	   throws IOException{
		System.out.print(message);
		BufferedReader reader = getReader();
		String input = reader.readLine();
		return input;
	}
	
	//this function reads a String input value
		public static int readInt(String message) 
		   throws IOException{
			System.out.print(message);
			BufferedReader reader = getReader();
			String input = reader.readLine();
			
			//the Integer.parseInt() method converts a String value
			//to become an integer valuer
			int inputValue = Integer.parseInt(input);
			return inputValue;
	}
		
		//this function reads a String input value
		public static double readDouble(String message) 
		   throws IOException{
			System.out.print(message);
			BufferedReader reader = getReader();
			String input = reader.readLine();
			
			//the Integer.parseDouble method converts a String value
			//to become an integer valuer
			double inputValue = Double.parseDouble(input);
			return inputValue;
	}
}

