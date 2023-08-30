package stringOperations;

import java.util.Scanner;

public class Palindrome extends ReverseString
{
	public static void main(String[] args) 
	{		
		System.out.println("Input a String to reverse: ");	
		Scanner objScanner = new Scanner(System.in);
		String strSource = objScanner.next();
		
	//	ReverseString objReverse = new ReverseString();
	//	String sDeststring = objReverse.ReversedString(strSource);
		
		System.out.println("Reversed String:" + ReversedString(strSource) );
		
		 if(strSource.equals(ReversedString(strSource)))
			System.out.println("It is a palindrome"); 
		 else
			System.out.println("It is not a palindrome");
	}
}