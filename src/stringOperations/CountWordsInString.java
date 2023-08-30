package stringOperations;

import java.util.Scanner;

import javax.naming.AuthenticationException;

public class CountWordsInString 
{
	public static void main(String[] args) 
	{
		System.out.println("We will be counting the words in the given string");
		Scanner objScanner = new Scanner(System.in) ;
		System.out.println("Enter the statement");
		String statementString = objScanner.nextLine();
		int iStringLength = statementString.length();
		System.out.println("Length of String " + iStringLength);
		int iWordCount = 0;
		int iWordCount2 = 0;
		
		for(int i = 0; i < iStringLength; i++ )
		{
			
			if((statementString.charAt(i)==' ')&&(statementString.charAt(i+1)!=' '))
			{
				iWordCount = iWordCount + 1;
				System.out.println(" " + statementString.charAt(i));
			}
			
		}
			
		System.out.println("The number of words in your statement = " + (iWordCount + 1));
		
		String[] strSplit = statementString.split(" ");
		iWordCount2 = strSplit.length;
		System.out.println("The number of words in your statement = " + (iWordCount2));

	}
}
