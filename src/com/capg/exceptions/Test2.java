package com.capg.exceptions;
import java.util.Scanner;


public class Test2 {
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the first num");
		int x=sc.nextInt();
		System.out.println("enter the second num");

		int y=sc.nextInt();

	
	Test1 obj=new Test1();
	try 
	{
		obj.division(x,y);
		
	}
	catch(ArithmeticException e){
		System.out.println("does not enter zero in denominater");
	}
	System.out.println("rest of code");

	
}
}
