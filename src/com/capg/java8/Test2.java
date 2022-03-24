package com.capg.java8;

public class Test2 implements left,right {
	public static void main(String[] args) {
	Test2 obj=new Test2();
	obj.m1();
	}
		
	
	public void m1() {
		left.super.m1(2,3);
		right.super.m1();
	}

}
