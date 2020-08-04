package com.stringBuffer.explain;

public class StringBufferExample {
	public static void main(String[] args) {

		String s = new String("dandi");
		System.out.println(s.length());

		StringBuffer sb = new StringBuffer("dandi");
		System.out.println(sb.capacity());
		System.out.println(sb.length());
		System.out.println("\n");

		StringBuffer sb1 = new StringBuffer();
		sb1.append("1234567891234567");
		System.out.println(sb1.capacity());
		sb1.append("17");
		System.out.println(sb1.capacity());
		System.out.println(sb1.length());
	}
}
