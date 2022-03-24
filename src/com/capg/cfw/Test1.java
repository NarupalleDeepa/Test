package com.capg.cfw;

import java.util.ArrayList;

public class Test1 {
	public static void main(String[] args) {
		ArrayList al=new ArrayList();
		System.out.println(al);

		al.add(new Integer(100));
		
		al.add(new String("Deepa"));
		al.add(new Float(13.4f));
		al.add(new Double(4.56));
		al.add(new Boolean(true));
		al.add(new Integer(100));
		al.add(null);
		al.add(null);

		System.out.println("output is: "+al);

		
	}

}
