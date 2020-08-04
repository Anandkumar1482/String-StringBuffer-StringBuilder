package com.string.explain;

public class ByteArrayToString {
	public static void main(String[] args) {

		byte[] b = { 97, 34, 98, 99 };
		String s = new String(b);
		System.out.println(s);

	}
}
