package com.testP;

public class FibbonicSeries {

	public static void main(String[] args) {
		int first = 1, second = 1, n = 10, third;
		System.out.println(first);
		System.out.println(second);
		for (int i = 3; i < n; i++) {
			third = first + second;
			System.out.println(third);
			first = second;
			second = third;

		}
	}

};