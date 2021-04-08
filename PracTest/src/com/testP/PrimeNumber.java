package com.testP;

public class PrimeNumber {
	public static void main(String args[]) {
		int n = 13, i;
		boolean isPrime = true;
		for (i = 2; i < n; i++) {
			while (n % i == 0) {

				isPrime = false;
				break;
			}

		}

		System.out.println(isPrime);

	}

}
