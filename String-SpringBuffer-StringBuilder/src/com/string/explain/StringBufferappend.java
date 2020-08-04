package com.string.explain;

public class StringBufferappend {
	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer(" master of");
		System.out.println(sb);

		StringBuffer sb1 = new StringBuffer(" computer applications");
		System.out.println(sb1);

		sb.append(sb1);
		System.out.println(sb);
	}
}
