package com.stringBuffer.explain;

public class CharSequenceStartEnd {
	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer("we are master ");
		CharSequence c = "in this world";
		sb.append(c, 8, 13);
		System.out.println(sb);
	}
}
