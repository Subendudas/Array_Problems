package com.bridgelabz_classPractice;

import java.util.Scanner;

public class Vowel 
{
	static void vowelcounter(String input) 
	{
		 int Count=0;  
	
		 for(int i = 0; i < input.length(); i++) 
		 {  
			 
	        if(input.charAt(i) == 'a' || input.charAt(i) == 'e' || input.charAt(i) == 'i' 
	      		|| input.charAt(i) == 'o' || input.charAt(i) == 'u' 
	            		/*|| input.charAt(i) == 'A' || input.charAt(i) == 'E' || input.charAt(i) == 'I' || input.charAt(i) == 'O' || input.charAt(i) == 'U'*/) 
	                  Count++;   
               
		 }
		 System.out.println("Number of vowels: " + Count);
	}

	
	public static void main(String[] args) 
	{
		Scanner sc =new Scanner(System.in);
		System.out.println("Please type the sentence.");
		String input = sc.nextLine();
		input=input.toLowerCase();
		vowelcounter(input);
		sc.close();
	}

}
