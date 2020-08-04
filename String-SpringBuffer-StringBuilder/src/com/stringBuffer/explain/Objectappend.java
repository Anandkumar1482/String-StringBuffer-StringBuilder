package com.stringBuffer.explain;

public class Objectappend {
	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer("anand");
		Object obj = "kumar";
		sb.append(obj);
		System.out.println(sb);

	}
}
