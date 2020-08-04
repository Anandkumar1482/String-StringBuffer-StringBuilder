package com.stringBuffer.explain;

public class CharArray {
	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer("hi my name is ");

		char[] ch = new char[] { 'a', 'n', 'a', 'n', 'd' };

		sb.append(ch);

		System.out.println(sb);

	}
}
