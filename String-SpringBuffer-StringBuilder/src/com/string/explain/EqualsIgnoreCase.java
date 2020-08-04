package com.string.explain;

import java.util.Scanner;

public class EqualsIgnoreCase {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter name");
		String name = sc.nextLine();
		sc.close();
		if (name.equalsIgnoreCase("Vizag")) {
			System.out.println("hello " + name);
		} else if (name.equalsIgnoreCase("Bangalore")) {
			System.out.println("hello " + name);
		} else if (name.equalsIgnoreCase("Hyderabad")) {
			System.out.println("hello " + name);
		} else {
			System.out.println("pls enter valid name");
		}
	}
}
