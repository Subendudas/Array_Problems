package com.bridgelabz_classPractice;

import java.util.Scanner;

public class Diff_In_index {
	
	public static boolean indexSpace(int array[],int k) 
	{
		int prevIndex=Integer.MIN_VALUE;
		for(int i=0;i<array.length;i++) {
			if(array[i]==1) 
			{
				if(prevIndex != Integer.MAX_VALUE && i - prevIndex -1<k) 
				{
					return false;
				}
				prevIndex = i;
			}
		}
		return true;
	}

	public static void main(String[] args) 
	{
		int n;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The Size of the Array. ");
		n=sc.nextInt();
		
		int [] array = new int[n];
		System.out.println("Enter The Elements. ");
		for(int i=0; i<array.length; i++)
		array[i]=sc.nextInt();
		
		System.out.println("Enter K a value.");
		int k=sc.nextInt();
		 sc.close();
		 boolean result = indexSpace(array, k);
	     
		    if (result)
		        System.out.println("True");
		 
		    else
		        System.out.println("False");
	
		
		
	}

}
