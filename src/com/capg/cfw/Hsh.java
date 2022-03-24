package com.capg.cfw;

import java.util.HashSet;
import java.util.LinkedList;

public class Hsh {
	public static void main(String[] args) {
		HashSet hs=new HashSet();
		System.out.println(hs);

		hs.add(new Integer(100));
		
		hs.add(new String("Deepa"));
		hs.add(new Float(13.4f));
		hs.add(new Double(4.56));
		hs.add(new Boolean(true));
		hs.add(new Integer(100));
		hs.add(null);
		System.out.println("output is: "+hs);

		
}
}
