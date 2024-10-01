package com.shamshad.loopAndFunction;

import java.util.Scanner;

public class NoOFOccurenceInNo {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("enter no : ");
		int n = in.nextInt();
		
		System.out.println("enter search no : ");
		int searchNo = in.nextInt();
		
		int count =0;
		while (n>0) {
			int check = n%10;
			if(check == searchNo) {
				count++;
			}
			n= n/10;
			
			
		}
		System.out.println(count);
	}

}
