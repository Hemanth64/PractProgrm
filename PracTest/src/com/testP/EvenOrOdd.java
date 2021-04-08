package com.testP;

import java.util.Scanner;

public class EvenOrOdd {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a number");
		int i = sc.nextInt();

		if (i % 2 == 0) {
			System.out.println("even");

		} else {
			System.out.println("odd");
		}
	}

}
