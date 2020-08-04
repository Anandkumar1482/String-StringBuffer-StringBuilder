package com.string.ownimmutable;

public class FinalAndImmutable {
	public static void main(String[] args) {
		final StringBuffer sb = new StringBuffer("dandi");
		sb.append("anand");
		System.out.println(sb);
		// sb = new StringBuffer("kumar");//The final local variable sb cannot be
		// assigned.

	}
}
