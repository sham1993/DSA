package com.shamshad.Arrays_ArraysList;

import java.util.Arrays;

public class MultiDimensionArray {

	public static void main(String[] args) {
		int[][] arr = new int[3][3];
		
		int [][] num = {
				{1,2,3},
				{2,3,4},
				{7,8,9}
		};
		
		//System.out.println(Arrays.toString(arr));
		
		
		
		for (int[] is : num) {
			System.out.println(Arrays.toString(is));
			
		}

	}

}
