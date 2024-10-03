package com.shamshad.Arrays_ArraysList;

import java.util.Arrays;
import java.util.Iterator;

public class Intro {

	public static void main(String[] args) {
		int[] num = new int[10];
		
		for (int i = 0; i < num.length; i++) {
			
			num[i]= (int)(Math.random()*100);
			
		}
		for(int i : num) {
			System.out.println(i);
		}
		
		
		System.out.println("another method "+Arrays.toString(num));
		
		
		
	}

}
