package code3;

public class DecrementIncrementExpression {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
		int iValue = 5;
		int iSum = iValue++ + 10;
		System.out.println("Sum: " + iSum);
		System.out.println("Value: " + iValue);
		
		int iValue2 = 5;
		int iSum2 = ++iValue2 + 10;
		System.out.println("\nSum 2: " + iSum2);
		System.out.println("Value 2: " + iValue2);
	}

}
