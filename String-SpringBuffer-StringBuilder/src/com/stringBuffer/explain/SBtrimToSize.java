package com.stringBuffer.explain;

public class SBtrimToSize {
	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer(1000);
		sb.append("abc");
		System.out.println(sb.capacity());
		sb.trimToSize();
		System.out.println(sb.capacity());

	}
}
