package com.testP;

public class Palindrome {

	public static void main(String[] args) {

		String s = "abcba";
		int i = 0, j = s.length() - 1;
		while (i < j) {
			if (s.charAt(i) != s.charAt(j)) {
				System.out.println("not palindrome");
				System.exit(0);
			}
			i++;
			j--;

		}
		System.out.println("Palindrome");

	}

}
