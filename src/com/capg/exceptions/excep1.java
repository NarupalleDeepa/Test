package com.capg.exceptions;
import java.util.InputMismatchException;
import java.util.Scanner;

public class excep1 {

	
	public static void main(String[] args) {
		//ctrl+shift+o- to import the packages
		
		try {
		Scanner s = new Scanner(System.in);
		
		System.out.println("enter the first number");
		int x = s.nextInt();
	
		System.out.println("enter the second number");
		int y = s.nextInt();
		
		int z= x/y;
		System.out.println("sum is: " + z);
		}
		
		catch(InputMismatchException im)
		{
			System.out.println("please enter only numeric values");
		}
		catch(ArithmeticException im)
		{
			System.out.println("dont enter denominateer as zero");

		}
		
		finally {
			System.out.println("i am from finally group");

	}
		System.out.println("rest of the code is executed");

	}
	
}

