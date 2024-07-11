package com.shamshad.mathematics;

public class CountDigit {

	public static void main(String[] args) {
		long number=111111111;
		System.out.println("count is " + countDigit(number));
		
		System.out.println("secong approach "+ (int)(Math.log10(number)+1));
		
	}
	
	public static int countDigit(long number) {
		int count = 0;
		
		while (number > 0) {
			
		number= number/10;
			
			
			count++;
		}
		
		return count;
		
		
	
	}

}
