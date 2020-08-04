package com.string.explain;

import java.util.Scanner;

public class StringtrimMethod {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter name");
		String name = sc.nextLine().toLowerCase().trim();
		sc.close();
		if (name.equals("vizag")) {
			System.out.println("hello " + name);
		} else if (name.equals("bangalore")) {
			System.out.println("hello " + name);
		} else if (name.equals("hyderabad")) {
			System.out.println("hello " + name);
		} else {
			System.out.println("pls enter valid name");
		}
	}
}
