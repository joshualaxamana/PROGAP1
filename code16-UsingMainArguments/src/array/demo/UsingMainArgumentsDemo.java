package array.demo;

public class UsingMainArgumentsDemo {

	public static void main(String[] args) 
		throws InterruptedException{
		
		if (args.length != 2) {
			System.err.println("Missing or invalid arguments.");
		} else {
			//note args[0] is the message
			String message = args[0];
			//note args[1] is the name of the sender
			String sender = args[1];
		
		char messageArr[] = message.toCharArray();
		for (char letra : messageArr) {
			System.out.print(letra);
			//the 500 represents a half-second delay
			//in Java 1000 milliseconds means 1 second
			Thread.sleep(500);
		}
		System.out.println("From - "
				+ sender);
	}
	}
}
