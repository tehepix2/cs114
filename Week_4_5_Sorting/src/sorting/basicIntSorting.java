package sorting;

public class basicIntSorting {
	/* Implementation on insertion sort for an array of int */
	public static void insertionSort(int[] arr) {
		for (int i = 1; i < arr.length; ++i) {
			for (int j = i; (j > 0) && (arr[j-1] > arr[j]); --j ) {
				swap(arr, j, j-1);
			}
		}
	}
	
	/* Implementation of bubble sort for an array of int*/
	public static  void bubbleSort(int[] arr){
		for (int i = 0; i < arr.length; ++i) {
			for (int j = 1; j < arr.length - i; ++j ) {
				if (arr[j-1] > arr[j]) {
					swap(arr, j-1, j);
				}
			}
		}
	}	
	 /* Implementation of selection sort for an array of int */
	public static void SelectionSort(int[] arr) {
		for (int i = 0; i < arr.length - 1; i++) {
			int maxInd = 0;
			for (int j = 1; j < arr.length - i; j++) {
				if (arr[j] > arr[maxInd]) {
					maxInd = j;
				}
			}
			swap(arr, maxInd, arr.length - i - 1);
		}
	}
	private static void swap(int[] arr, int i1, int i2) {
		int temp = arr[i1];
		arr[i1] = arr[i2];
		arr[i2] = temp;	
	}
}
