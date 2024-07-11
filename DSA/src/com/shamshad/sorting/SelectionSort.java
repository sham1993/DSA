package com.shamshad.sorting;

import java.util.Arrays;

public class SelectionSort {

	public static void main(String[] args) {
		int arr[] = { 0, 8, 2, 6, 4, 5 };

		sort(arr);
		System.out.println(Arrays.toString(arr));

	}

	private static void sort(int[] arr) {

		for (int i = 0; i < arr.length; i++) {

			int last = arr.length - 1 - i;
			int start = 0;
			int maxIndex = findMaxIndex(arr, start, last);
			swap(arr, maxIndex, last);

		}

	}

	private static void swap(int[] arr, int maxIndex, int last) {

		int temp = arr[last];
		arr[last] = arr[maxIndex];
		arr[maxIndex] = temp;

	}

	private static int findMaxIndex(int[] arr, int start, int last) {
		int max = start;
		for (int i = 0; i <= last; i++) {
			if (arr[i] > arr[max]) {
				max = i;
			}
		}

		return max;
	}

}
