package com.stringBuffer.explain;

public class SBinsert {
	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer("anand");
		CharSequence s = "dandi";
		sb.insert(0, s, 0, 3);
		System.out.println(sb);

		StringBuffer sb1 = new StringBuffer("abcdefg");
		Object obj = "alphabets are ";
		sb1.insert(0, obj);
		System.out.println(sb1);

	}
}
