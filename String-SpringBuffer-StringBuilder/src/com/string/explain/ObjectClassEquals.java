package com.string.explain;

public class ObjectClassEquals {
	public static void main(String[] args) {
		Object obj = new String("durga");
		Object obj1 = new String("durga");
		System.out.println(obj == obj1);
		System.out.println(obj.equals(obj1));
	}
}
