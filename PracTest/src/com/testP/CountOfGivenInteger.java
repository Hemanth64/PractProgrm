package com.testP;

public class CountOfGivenInteger {

	public static void main(String[] args) {

		int n = 45795;
		int count = 0;
		while (n > 0) {
			n = n / 10;
			count++;
		}
		System.out.println(count);

	}

}
