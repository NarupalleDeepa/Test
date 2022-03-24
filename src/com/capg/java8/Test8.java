package com.capg.java8;
import java.util.function.Predicate;

public class Test8 {
	public static void main(String[] args) {
		Predicate<Integer> p=i->i>10;
		System.out.println(p.test(56));
		
		System.out.println(p.test(3));

	}

}
