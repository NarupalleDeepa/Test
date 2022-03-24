package com.capg.cfw;

import java.util.TreeMap;

public class Test10 {
	
	public static void main(String[] args) {
		
		TreeMap tm = new TreeMap();
		
		tm.put("deepa", 30);
		tm.put("papa", 5);
		tm.put("mama", 2);
		tm.put("kuppa",40);
		
		tm.put("phone",90);
		
		//invalid: tm.put("abc", 17);
		
		//tm.put(null, null);//invalid
		
		System.out.println(tm);
		
	}

}
