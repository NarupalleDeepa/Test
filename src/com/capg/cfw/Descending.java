package com.capg.cfw;

import java.util.TreeSet;

public class Descending {
	public static void main(String[] args) {
		TreeSet<Integer> ll=new TreeSet<Integer>(new MyComparator());
		ll.add(new Integer(100));
		ll.add(new Integer(5));

		ll.add(new Integer(106));
		ll.add(new Integer(190));
		ll.add(new Integer(40));
		ll.add(new Integer(76));
		ll.add(new Integer(4000));
		System.out.println(ll);


	}

}
