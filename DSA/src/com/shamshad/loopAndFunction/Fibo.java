package com.shamshad.loopAndFunction;

import java.util.Scanner;

public class Fibo {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		System.out.println("enter no");
		int n = in.nextInt();
		int a=0;
		int b=1;
		int count =2;
		
		while (count <= n) {
			
			int temp = b;
			b= a+b;
			a=b;
			count++;
		}
		
		System.out.println("ans :" + b);

	}

}
