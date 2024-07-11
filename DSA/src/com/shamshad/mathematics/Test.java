package com.shamshad.mathematics;

public class Test {

	public static void main(String[] args) {
		int a=10;
		
		int count = (int)Math.log10(a)+1;
		//ccsdjbsdhsbdsddddss
		int x=5;
		int y=6;
		System.out.println(x & y);

	}
	
	
	
	
	public int count(int no) {
		int count=0;
		while(no>0) {
			no=no/10;
			count++;
		}
		return count;
	}	
			

}
