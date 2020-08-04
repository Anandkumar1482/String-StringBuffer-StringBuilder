package com.stringBuffer.explain;

public class StringBuffercharAt {
	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer("dandi");
		System.out.println(sb.length());
		System.out.println(sb.capacity());
		System.out.println(sb.charAt(3));
		// System.out.println(sb.charAt(30));

		String s = new String("dandi");
		System.out.println(s.charAt(3));
		System.out.println(s.charAt(30));
	}
}
