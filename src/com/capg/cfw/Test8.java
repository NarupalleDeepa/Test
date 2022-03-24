package com.capg.cfw;

import java.util.Set;
import java.util.Map.Entry;
import java.util.HashMap;

public class Test8 {
	public static void main(String[] args) {
		HashMap<Integer,String> hs=new HashMap<Integer,String>();
		hs.put(100,"Deepa");
		hs.put(40,"gudda");
		hs.put(400,"godda");
		hs.put(2,"budda");
		hs.put(50,"biddaa");
		hs.put(80,"papa1");
		hs.put(300,"viswa");
		hs.put(200,"papa1");
		hs.put(null,null);
		System.out.println(hs);
		System.out.println(hs.size());
		System.out.println(hs.get(40));
		System.out.println(hs.remove(400));
		
		System.out.println(hs.size());
		System.out.println(hs.entrySet());
		for(Entry<Integer,String>entry:hs.entrySet()) {
			System.out.println(entry.getValue());
			System.out.println(entry.getKey());
			
		}


	}

}

