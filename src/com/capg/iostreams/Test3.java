package com.capg.iostreams;


import java.io.IOException;
import java.io.PrintWriter;

public class Test3 {
	public static void main(String[] args) throws IOException {
		PrintWriter pw=new PrintWriter("abc.txt");
		pw.print("xyz");
		pw.print("deepa");
		pw.print(10.5);
		pw.print(100);
		pw.print(3.8f);
		pw.close();



	}

}
