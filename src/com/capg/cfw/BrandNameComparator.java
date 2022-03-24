package com.capg.cfw;

import java.util.Comparator;

public class BrandNameComparator implements Comparator<Product> {
	public int comparator(Product o1,Product o2) {
		return o1.getBrandName().compareTO(o2.getBrandName());
	}

}
