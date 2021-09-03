package com.bridgelabz_largeandSmall;

import java.util.Scanner;

public class LargeandSmall 
{
	 static void  checkArray() 
	{
		int n;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The Size of the Array. ");
		n=sc.nextInt();
		
		int [] array = new int[n];
		System.out.println("Enter The Elements. ");
		for(int i=0; i<array.length; i++)
		array[i]=sc.nextInt();
		
		int largest = array[0];
		int smallest=array[0];
		
		for(int i=1; i<array.length; i++)
        {
                if(array[i] > largest)
                        largest = array[i];
                else if (array[i] < smallest)
                        smallest = array[i];
        }
		
		 System.out.println("Largest Number is : " + largest);
         System.out.println("Smallest Number is : " + smallest);
         sc.close();
        
	}

	public static void main(String[] args) 
	{
		checkArray();
	}

}
	
