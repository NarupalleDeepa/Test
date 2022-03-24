package com.capg.java8;

public class Test5 implements interf1 {
	public int square(int a)
	{
		return a*a;
		
		
	}
	public static void main(String[] args) {
		interf1 i=new Test5();
		int d=i.square(7);
		System.out.println(d);
		
	}

}
