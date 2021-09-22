package com.bridgelabz_classPractice;

import java.util.Scanner;

public class Operations implements Calculator{
	 Scanner sc = new Scanner(System.in);
	public double num1,num;
	int numq;
	public double num2;
	public double result;
	
	@Override
	public void add(double num1, double num2)
	{
		System.out.println("Addition= "+ (num1+num1));
		System.out.println("----  ---- ---- ----");
		//return num1+num2;
	}
	
	@Override
	public void subtract(double num1, double num2)
	{
		System.out.println("Substraction= "+ (num1-num2));
		System.out.println("----  ---- ---- ----");
		//return num1-num2;
	}
	@Override
	public void divide(double num1, double num2)
	{
		System.out.println("Division= "+ num1/num2);
		System.out.println("----  ---- ---- ----");
		//return num1/num2;
	}
	@Override
	public void multiply(double num1, double num2)
	{
		System.out.println("Multiplication= "+ num1*num2);
		System.out.println("----  ---- ---- ----");
		//return num1*num2;
	}
	@Override
	public void square(double num1)
	{
		System.out.println("Square= "+Math.pow(num1, 2));
		System.out.println("----  ---- ---- ----");
	}
	@Override
	public void sqrt(double num1)
	{
		System.out.println("Square Root= "+(Math.sqrt(num1)));
		System.out.println("----  ---- ---- ----");
	}
	@Override
	public void cube(double num1)
	{
		System.out.println("Cube = "+(Math.pow(num1,3)));
		System.out.println("----  ---- ---- ----");
	}
	@Override
	public void cbrt(double num1)
	{
		System.out.println("Cube Root = "+(Math.cbrt(num1)));
		System.out.println("----  ---- ---- ----");
	}
	@Override
	public void quit() {
		System.out.println("Program Ended!");
		System.exit(0);
	}
	

public static void main(String[] args) 
{	
	//boolean q =false;
	int choice=0;
	//boolean run=true;
	//while(choice!=9)
	do {
    Scanner sc = new Scanner(System.in);
    Operations obj = new Operations();
    System.out.println("Choose Choice:\n \n 1 for Addition\n 2 for Substraction\n 3 for Multiplication\n 4 for Division");
    System.out.println(" 5 for Square\n 6 for Square Root\n 7 for Cube\n 8 for CubeRoot\n Press 9 to quit the calculator.");
    choice = sc.nextInt();
  
    if(choice==5|| choice==6|| choice==7|| choice==8) {
    	System.out.println("Enter Number");
    	double num = sc.nextDouble();
    	switch(choice) {
    	case 5:
    		obj.square(num);
    		break;
    		
    	case 6:
    		obj.sqrt(num);
    		break;
    	case 7:
    		obj.cube(num);
    		break;
    	case 8:
    		obj.cbrt(num);
    		break;
    	/*case 9:
    		obj.quit();
    		break;*/
    	}
    }
    if(choice==9) {
    	obj.quit();
    	break;
    }
    else if(choice==1||choice==2||choice==3||choice==4)
    {
    System.out.println("Enter First Number");
	double num1 = sc.nextDouble();
	System.out.println("Enter Second Number");
	double num2 =sc.nextDouble();
	
	switch(choice) {
	case 1:
		obj.add(num1,num2);
		break;
	
	case 2:
		obj.subtract(num1,num2);
		break;
	
	case 3:
		obj.multiply(num1,num2);
		break;
	
	case 4:
		obj.divide(num1,num2);
		break;
	default:
        System.out.println("Invalid Choice!");
        break;
	}
	sc.close();
	
}

}while(choice!=Integer.MAX_VALUE);
	/*if (choice==9)
		System.exit(0);*/
}
}
