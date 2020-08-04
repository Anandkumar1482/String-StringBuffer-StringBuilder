package com.string.explain;

public class StringClassMethods {
	public static void main(String[] args) {
		String s = "";
		System.out.println(s.isEmpty());
		String s1 = "dandi";
		System.out.println(s1.isEmpty());
		String s2 = "anand";
		System.out.println(s2.length());

		System.out.println(s2.indexOf('a'));
		System.out.println(s2.lastIndexOf('a'));

		String s3 = "anand";
		System.out.println(s3.contentEquals(s2));
	}
}
