package com.capg.cfw;
import java.util.Comparator;


public class Product implements Comparable<Product> {
	private int pid;
	private String pname;
    private String brandname;
	private double price;
	public Product() {
		
	}
	public int getPid() {
		return pid;
	}
	public void setPid(int pid) {
		this.pid = pid;
	}
	public String  getpname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname =pname ;
	}

	public String getBrandName() {
		return brandname;
	}

	public void setBrandName(String brandname) {
		this.brandname =brandname ;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}
	
	
	public String toString()
	{
		return pid + " " + pname + " " +brandname + " " + price;
	}

	@Override
	public int compareTo(Product o) {
		return pid;
		
	}

	

}
	
	
	
	


