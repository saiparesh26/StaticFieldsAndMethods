package com.saiparesh;

public class Counter {
	public static int count;
	public int anotherCount;
	
	public Counter() {
		// TODO Auto-generated constructor stub
		count++;
		anotherCount++;
	}
	
	public static void main(String[] args) {
		Counter one = new Counter();
		Counter two = new Counter();
		Counter three = new Counter();
		Counter four = new Counter();
		
		System.out.println(count);
		System.out.println(one.count);
		System.out.println(two.count);
		System.out.println(three.count);
		System.out.println(four.count);
		
		System.out.println(one.anotherCount);
		System.out.println(two.anotherCount);
		System.out.println(three.anotherCount);
		System.out.println(four.anotherCount);
	}
	
}
