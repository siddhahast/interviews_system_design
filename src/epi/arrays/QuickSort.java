package epi.arrays;

public class QuickSort {

	public static void main(String[] args) {
		int[] arr = { 3, 10, 16, 11, 15, 19, 1, 90, 73, 76 };
		System.out.println("::: before rearrangement ::: ");
		display(arr);
		quickSort(arr, 0, arr.length-1);
		System.out.println("::: after rearrangement ::: ");
		display(arr);
	}

	private static int rearrageElementsPivot(int[] arr, int lo, int hi) {
		int low = lo;
		int high = hi;

		int pivotElement = arr[low];

		while (low < high) {

			while (arr[low] <= pivotElement) {
				low++;
			}

			while (arr[high] > pivotElement) {
				high--;
			}

			if (low < high) {
				swap(arr, low, high);
			}

		}
		arr[lo] = arr[high];
		arr[high] = pivotElement;
		return high;

	}

	private static void swap(int[] arr, int i, int j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}

	private static void display(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}

	public static void quickSort(int[] arr, int low, int high) {
		if (low < high) {
			int pivotIndex = rearrageElementsPivot(arr, low, high);
			quickSort(arr, low, pivotIndex-1);
			quickSort(arr, pivotIndex, high);
		}
	}

}
