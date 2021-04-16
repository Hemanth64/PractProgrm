package com.testP;

public class Tables {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		for (int i = 1; i < 10; i++) {//rows

			for (int j = 1; j <= i; j++) { //columns

				System.out.print(" *");
			}
			System.out.println();
		}

	}

}
