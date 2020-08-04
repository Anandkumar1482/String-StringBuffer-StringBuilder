package com.string.explain;

public class StringImmutabilityExample1 {
	public static void main(String[] args) {
		String s = "dandi";
		String s2 = s.toString();
		String s3 = s2.toLowerCase();
		String s4 = s3.toUpperCase();
		System.out.println(s == s2);// true
		System.out.println(s == s3);// true
		System.out.println(s == s4);// false
	}
}
