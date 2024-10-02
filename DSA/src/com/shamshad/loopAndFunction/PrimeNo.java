package com.shamshad.loopAndFunction;

import java.util.Scanner;

public class PrimeNo {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int num = in.nextInt();

		boolean ans = isPrime(num);
		System.out.println("prime : " + ans);
	}

	public static boolean isPrime(int num) {
		if (num <= 1) {
			return false;
		}

		int c = 2;
		while (c * c <= num) {
			if (num % c == 0) {
				return true;
			}

			c++;
		}

		return c * c > num;
	}

}
