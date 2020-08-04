package com.stringBuffer.explain;

public class SBdelete {
	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer("abcdefghijklmnop");
		sb.delete(0, 6);
		System.out.println(sb);

	}
}
