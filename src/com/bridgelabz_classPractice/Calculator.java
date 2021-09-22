package com.bridgelabz_classPractice;

//import java.util.Scanner;

public interface Calculator {
	 void add(double num1, double num2);
	void subtract(double num1, double num2);
	void divide(double num1, double num2);
	void multiply(double num1, double num2);
	void square(double num);
	void sqrt(double num);
	void cube(double num);
	void cbrt(double num);
	void quit();
}

/*class Operations implements Calculator{
	public int num1;
	public int num2,operation;
	public float result;
	@Override
	public void add(int num1, int num2)
	{
		System.out.println("Addition= "+ num1+num2);
		//return num1+num2;
	}
	@Override
	public int subtract(int num1, int num2)
	{
		System.out.println("Substraction= "+ (num1-num2));
		return num1-num2;
	}
	@Override
	public int divide(int num1, int num2)
	{
		System.out.println("Division= "+ num1/num2);
		return num1/num2;
	}
	@Override
	public int multiply(int num1, int num2)
	{
		System.out.println("Multiplication= "+ num1*num2);
		return num1*num2;
	}
	/*void  options(){
		switch (operation) {

	      // performs addition between numbers
	      case '1':
	    	  add(num1, num2);
	        /*result = num1 + num2;
	        System.out.println(num1 + " + " + number2 + " = " + result);*/
	       /* break;

	      // performs subtraction between numbers
	      case '2':
	    	  subtract(num1, num2);
	        /*result = number1 - number2;
	        System.out.println(number1 + " - " + number2 + " = " + result);*/
	       /* break;

	      // performs multiplication between numbers
	      case '3':
	    	  divide(num1,num2);
	        /*result = number1 * number2;
	        System.out.println(number1 + " * " + number2 + " = " + result);*/
	       /* break;

	      // performs division between numbers
	      case '4':
	    	  multiply(num1, num2);
	    	  }
	        //result = number1 / number2;
		
	}

public static void main(String[] args) 
{
	//char operator;
	int num1,num2,operation;
	
    Scanner sc = new Scanner(System.in);
    System.out.println("Choose an operator: 1 for Addition, 2 for Substraction, 3 for Division, 4 for Multiplication");
    operation = sc.nextInt();
	System.out.println("Enter First Number");
	num1 = sc.nextInt();
	System.out.println("Enter Second Number");
	num2 =sc.nextInt();
	sc.close();
	Operations obj = new Operations();
	obj.add(num1,num2);
	obj.subtract(num1,num2);
	obj.multiply(num1,num2);
	obj.divide(num1,num2);
	obj.options();
	
}
}*/

