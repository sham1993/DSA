package com.shamshad.mathematics;

public class Palinidrome {

	public static void main(String[] args) {
		int num = 1211;
		System.out.println("result : " + checkpalidrom(num));

	}

	private static boolean checkpalidrom(int number) {

		int rev = 0;
		int rem = 0;
		int num = number;
		while (num > 0) {
			rem = num % 10;

			rev = rev * 10 + rem;

			num = num / 10;

		}

		if (number == rev) {
			return true;
		} else {
			return false;
		}

	}

}
