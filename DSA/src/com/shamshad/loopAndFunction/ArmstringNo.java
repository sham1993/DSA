package com.shamshad.loopAndFunction;

import java.util.Scanner;

public class ArmstringNo {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		System.out.println("Enter no : ");
		int num = in.nextInt();

		boolean ans = isArmstrongNo(num);
		System.out.println("Armstrong no : " + ans);

	}

	private static boolean isArmstrongNo(int num) {

		int temp = num;
		int sum = 0;
		while (num > 0) {
			int rem = num % 10;
			sum = sum + rem * rem * rem;
			num = num / 10;
		}

		return sum == temp;
	}

}
