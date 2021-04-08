package com.testP;

public class FindLarandSmalNum {
	public static void main(String args[]) {

		int num[] = new int[] {  58, 78, 35, 78, 56, 49 ,112};
		int lar = num[0];//58
		int sm = num[0];
		for (int i = 1; i < num.length; i++) {

			if (num[i] > lar) {//112<58
				lar = num[i];//78
			} else if (num[i] < sm) {//
				sm = num[i];//49

			}
			
		}
		System.out.println(lar+"  "+sm);
	}
}
