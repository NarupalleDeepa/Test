package com.capg.cfw;

import java.util.LinkedHashSet;

public class Lhs {
	public static void main(String[] args) {
		LinkedHashSet ll=new LinkedHashSet();
		System.out.println(ll);

		ll.add(new Integer(100));
		
		ll.add(new String("Deepa"));
		ll.add(new Float(13.4f));
		ll.add(new Double(4.56));
		ll.add(new Boolean(true));
		ll.add(new Integer(100));
		ll.add(null);
		System.out.println("output is: "+ll);

		
	
	
	}
}
