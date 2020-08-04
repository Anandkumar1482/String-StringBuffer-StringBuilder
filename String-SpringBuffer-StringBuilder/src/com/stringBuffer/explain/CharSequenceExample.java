package com.stringBuffer.explain;

public class CharSequenceExample {
	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer("dandi");
		CharSequence cs = "anand";
		sb.append(cs);
		System.out.println(sb);

	}
}
