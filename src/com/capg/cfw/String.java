package com.capg.cfw;
import java.util.SortedSet;

import java.util.TreeSet;

public class String {
	public static void main(String[] args) {
		TreeSet<String>ll=new TreeSet<String>(new MyComparator());
		ll.add("deepa");
		ll.add("pappu");

		ll.add("budda");
		ll.add("gooda");
		ll.add("swetha");
		ll.add("sujana");
		System.out.println(ll);



}

	
	}
