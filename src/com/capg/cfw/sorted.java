3package com.capg.cfw;

import java.util.TreeSet;

public class sorted {
	public static void main(String[] args) {
		TreeSet ll=new TreeSet();
		System.out.println(ll);

		ll.add(new Integer(100));
		ll.add(new Integer(5));

		ll.add(new Integer(106));
		ll.add(new Integer(190));
		ll.add(new Integer(40));
		ll.add(new Integer(76));
		ll.add(new Integer(4000));


		System.out.println("output is: "+ll);
		System.out.println(ll.headSet(106));
		System.out.println(ll.last());
		System.out.println(ll.first());
		System.out.println(ll.tailSet(40));
		System.out.println(ll.subSet(70,4000));

		

		

}
}
