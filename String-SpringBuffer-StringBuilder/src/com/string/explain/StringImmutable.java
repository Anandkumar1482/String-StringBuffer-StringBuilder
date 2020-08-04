package com.string.explain;

public class StringImmutable {
	public static void main(String[] args) {
		String s = new String("durga");
		s.concat("soft");
		System.out.println(s);
	}
}

/*if we create string object if we want perform any changing that string object, for every changing 
 * a new string object will be created. so that String is immutable class.
 */
