package array.demo;

public class MultiDimensionalArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//sample valid 2D array declarations 
		
		int number [][] = new int [5][2];
		//int[] number2[]= new int [6][3];
		
		
		number[1][0] = 100; 
		number[3][0]= 20; 
		number[4][1]= 50; 
		
		printArray(number);
		System.out.println("Summation:" + getSummation(number));

		System.out.println("Product:" + getProduct(number));
		
	}
	//2D array parameter passing 
	public static void printArray(int mgaNumero[][]) 
	{
		for(int outerCtr = 0; outerCtr < mgaNumero.length; outerCtr ++) 
		{
			for(int innerCtr = 0; innerCtr < mgaNumero[outerCtr].length; innerCtr++)
			{
				System.out.println("["+outerCtr+"] [" + innerCtr + "]:" + mgaNumero[outerCtr][innerCtr]);
			}
		}
	}

	
	public static int getSummation(int mgaNumero[][]){
		int summation = 0; 
		//perform code logic here - use for loop
		for (int outerCtr = 0; outerCtr < mgaNumero.length; outerCtr ++)
		{
			for(int innerCtr = 0; innerCtr < mgaNumero[outerCtr].length; innerCtr++){

				summation += mgaNumero[outerCtr][innerCtr];
			}
		}
	
		
		
		return summation; 
	}
	
	
	public static int getProduct(int mgaNumero[][]){
		int product = 1; 
		//perform code logic here - use for loop
		for (int outerCtr = 0; outerCtr < mgaNumero.length; outerCtr ++)
		{
			for(int innerCtr = 0; innerCtr < mgaNumero[outerCtr].length; innerCtr++){

				product *= mgaNumero[outerCtr][innerCtr];
			}
		}
	
		
		
		return product; 
	}
}
