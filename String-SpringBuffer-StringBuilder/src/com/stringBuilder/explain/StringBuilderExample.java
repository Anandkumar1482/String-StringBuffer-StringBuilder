package com.stringBuilder.explain;

public class StringBuilderExample {
	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer();
		sb.append('a').insert(1, "bc");
		System.out.println(sb);

	}
}
