package com.capg.cfw;

import java.util.LinkedList;

public class Test2 {
	public static void main(String[] args) {
		LinkedList ll=new LinkedList();
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
