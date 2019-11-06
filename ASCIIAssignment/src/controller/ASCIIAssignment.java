package controller;


import java.io.IOException;

import utility.InputHelper;
import model.Words;


public class ASCIIAssignment {

	public static void main(String[] args) 
		throws IOException, InterruptedException {
		Words.words = InputHelper.readString("Enter word/s: ");
		displayAscii();
		Words.search = InputHelper.readString("Searched Word: ")
		System.out.println("\nSummary: ");
		System.out.println("\nNumber of Visible Characters: " );
		System.out.println("Number of Invisible Characters: ");
		System.out.println("Total Characters: " + getTotalChars(Words.words));
		
	}
	
	public static void displayAscii() {
		
		int[] count = new int[256];
        char[] words = Words.words.toCharArray();

        int i = 0;
        for(i = 0; i < words.length; i++) {
            count[words[i]]++;
        }
		System.out.println("DEC\tChar\tOCC");
		for (int ctr = 0; ctr <=255; ctr++) {
			System.out.println(ctr +"\t" + (char) (ctr) + "\t" + count[ctr]);
		}
	}
	
	

	public static int getTotalChars(String length) {
		String total = Words.words;
		int counter = total.length();
		return counter;
	}
	
	public static int getEmbeddedSearchedWord(String words) {
		int i,ctr=0;
	    {
	        char ch[]= new char[words.length()];  
	        for(i = 0; i < words.length();i++)
	        {
	            ch[i]= words.charAt(i);
	            if( ((i > 0)&&(ch[i]!=' ')&&(ch[i-1]==' ')) || ((ch[0]!=' ')&&(i==0)) )
	            ctr++;
	        }
	        return ctr;
	    }
	  
	}

}
