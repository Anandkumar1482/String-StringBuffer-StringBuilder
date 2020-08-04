package com.stringBuffer.explain;

public class StringBufferCharAppend {
	public static void main(String[] args) {

		StringBuilder sbf = new StringBuilder("Welcome !");
		System.out.println(sbf);

		/*
		 * Here it appends the char argument as string to the StringBuilder
		 */
		sbf.append('T');
		System.out.println("Result after" + " appending = " + sbf);

		sbf = new StringBuilder("hello world-");
		System.out.println(sbf);
		/*
		 * Here it appends the char argument as string to the String Builder
		 */
		sbf.append('#');
		System.out.println("Result after appending = " + sbf);
	}

}
