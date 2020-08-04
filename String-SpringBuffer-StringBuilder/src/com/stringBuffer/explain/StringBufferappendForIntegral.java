package com.stringBuffer.explain;

public class StringBufferappendForIntegral {
	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer();
		sb.append("the value of PI ");
		System.out.println(sb);
		sb.append(3.14);
		System.out.println("is exactly same as ");
		sb.append(true);
		CharSequence ch = " 3.14 ";
		sb.append(ch);
		System.out.println(sb);
	}
}
