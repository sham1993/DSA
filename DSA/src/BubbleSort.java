import java.util.Arrays;

public class BubbleSort {

	public static void main(String[] args) {
		int arr[] = { 0,8,2,6,4,5 };

		sort(arr);
		System.out.println(Arrays.toString(arr));
	}

	private static void sort(int[] arr) {
		// 3 2 4 5
           
		for (int i = 0; i < arr.length; i++) {
			boolean isSwapped=false;
			for (int j = 1; j < arr.length - i; j++) {

				if (arr[j + 1] < arr[j]) {
					swap(j + 1, j, arr);
					isSwapped=true;
				}

			}
			if(!isSwapped) {
				break;
			}
			 System.out.println("run loop : "+i+ " " + Arrays.toString(arr));
		}

	}

	private static void swap(int first, int second, int[] arr) {
		int temp = arr[second];
		arr[second] = arr[first];
		arr[first] = temp;

	}

}
