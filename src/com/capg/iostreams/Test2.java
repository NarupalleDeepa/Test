package com.capg.iostreams;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Test2 {
	public static void main(String[] args) throws IOException {
		FileWriter fw = new FileWriter("abc.txt");
		BufferedWriter fb= new BufferedWriter(fw);
		fb.write("xyz");
		fb.newLine();
		fb.write("abd");
		fb.newLine();
		fb.write(100);
		fb.newLine();
		fb.write("deepaviswanath");
		fb.close();




	}
	

}
