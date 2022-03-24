package com.capg.iostreams;

import java.io.FileReader;
import java.io.IOException;

public class Test4 {
	public static void main(String[] args) throws IOException {
		FileReader fd=new FileReader("abc.txt");
		int x=fd.read();
		while(x!=-1)
		{
			System.out.println((char)x);
			x=fd.read();
		}
		
	}

}
