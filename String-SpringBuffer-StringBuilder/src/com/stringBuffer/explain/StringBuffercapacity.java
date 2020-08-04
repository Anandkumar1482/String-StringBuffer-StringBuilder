package com.stringBuffer.explain;

public class StringBuffercapacity {
	public static void main(String[] args) {
		StringBuffer sb1 = new StringBuffer();
		sb1.append("1234567891234567");
		System.out.println(sb1.capacity());
		sb1.append("1");
		System.out.println(sb1.capacity());
		sb1.append("1234567891234567");
		sb1.append("12");
		System.out.println(sb1.capacity());
		System.out.println(sb1.length());
	}
}
