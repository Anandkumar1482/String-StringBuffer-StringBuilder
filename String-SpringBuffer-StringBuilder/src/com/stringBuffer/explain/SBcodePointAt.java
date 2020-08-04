package com.stringBuffer.explain;

public class SBcodePointAt {
	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer("anand kumar dandi");
		int at = sb.codePointAt(3);
		System.out.println(at);
		int before = sb.codePointBefore(4);
		System.out.println(before);
		int count = sb.codePointCount(0, 7);
		System.out.println(count);
		sb.appendCodePoint(at);
		System.out.println(sb);

	}
}
