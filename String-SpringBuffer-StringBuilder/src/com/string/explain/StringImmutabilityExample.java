package com.string.explain;

public class StringImmutabilityExample {
	public static void main(String[] args) {
		String s = "dandi";
		String s1 = s.toUpperCase();
		String s2 = s.toLowerCase();
		System.out.println(s == s1);
		System.out.println(s == s2);
	}
}
