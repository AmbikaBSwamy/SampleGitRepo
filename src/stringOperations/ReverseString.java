package stringOperations;

import java.util.Scanner;

public class ReverseString 
{
	public static String ReversedString(String sourceString)
	{
		String sDestString = "";
		int iStrLength = sourceString.length();

		for(int i=iStrLength-1;i>=0; i--)
		{
			sDestString = sDestString+sourceString.charAt(i);
		}
		return sDestString;
	}
	
	public static void main(String[] args) 
	{
		System.out.println("Input a String to reverse: ");
		Scanner objScanner = new Scanner(System.in);	
		String strSource = objScanner.next();
		
		System.out.println("Entered String: " + strSource);
		System.out.println("Reversed String: " + ReversedString(strSource));
	}
}
