package com.string.ownimmutable;

public class StringOperation {
	public static void main(String[] args) {
		String s = "dandi";
		String s1 = s.concat("anand");
		String s2 = s.concat("kumar");
		System.out.println(s == s1);
		System.out.println(s == s2);

		StringBuffer sb = new StringBuffer("dandi");
		sb.append("anand");
		sb.append("kumar");
		System.out.println(sb);

	}
}
