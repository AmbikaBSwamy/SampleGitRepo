package stringOperations;

import java.util.Scanner;

public class ReverseString 
{
	public static void main(String[] args) 
	{
		System.out.println("Input a String to reverse: ");
		Scanner objScanner = new Scanner(System.in);
		
		String strSource = objScanner.next();
		
		System.out.println("Entered String: " + strSource);
		
	}
}
