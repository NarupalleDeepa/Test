package com.capg.iostreams;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Bufferedr {
	public static void main(String[] args) throws IOException {
		FileReader fd=new FileReader("abc.txt");
		BufferedReader br=new BufferedReader(fd);
		String s=br.readLine();
		while(s!=null){
			System.out.println(s);
			s=br.readLine();
			
		}
		
	                  
		

	}
	
}
