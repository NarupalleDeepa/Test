package com.capg.exceptions;
import java.util.InputMismatchException;

import java.util.Scanner;


public class Exep {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the first num ");
		int x=sc.nextInt();
		try {
			
		
		System.out.println("enter the second num");
		int y=sc.nextInt();
		
		int z=x+y;
		System.out.println("sum"+z);
		}
		
		catch(InputMismatchException e)
		{
			System.out.println("pls give numarical values");
			System.out.println("rest of code will be excuted");

			

		}
		
			
		}
		
		



		
	}


