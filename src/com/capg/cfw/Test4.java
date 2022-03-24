package com.capg.cfw;

import java.util.ArrayList;

public class Test4 {
	public static void main(String[] args) {
		ArrayList al=new ArrayList();
		for(int i=1;i<=10;i++)
		{
			al.add(i);
		}
		System.out.println(al);
		for(int i=1;i<al.size();i++) {
			

		
		System.out.println(al.get(i));
		}
		for(Object o:al) {
			Integer x=(Integer)o;
			if(x%2!=0) {
			System.out.println(x);
		}	}

}
}
