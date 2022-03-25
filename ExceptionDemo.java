package exception.finish;

import java.util.Scanner;

public class ExceptionDemo 
{
	public static void main(String[] args)
	{
		ExceptionDemo ec=new ExceptionDemo();
		ec.calculate();
	}

	public void calculate() 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println(" Enter the 1 no :");
		int n1=sc.nextInt();
		System.out.println(" ENter the 2 no :");
		int n2=sc.nextInt();
		try 
		{
		System.out.println(" Answer "+n1/n2);
		}
		catch(ArithmeticException e)
		{
			System.out.println("**** try again *****");
		
			calculate();
		}
	}

}
