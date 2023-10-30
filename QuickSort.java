package codemon;

public class QuickSort {
	public static void main(String[] args) {

		int[] arr = { 10, 22, 1, 7, 5, 9, 3, 4, 17, 19 };

		System.out.println("Before Sorting :");
		for (int i : arr) {
			System.out.print(i + " ");
		}
		System.out.println();
		// method called
		QuickSort(arr, 0, arr.length - 1);

		System.out.println("After Sorting :");
		for (int i : arr) {
			System.out.print(i + " ");
		}
	}

	private static void QuickSort(int[] arr, int low, int high) {
		if (low < high) {
			int pivot = Partition(arr, low, high);

			QuickSort(arr, low, pivot - 1);
			QuickSort(arr, pivot + 1, high);
		}

	}

	private static int Partition(int[] arr, int low, int high) {
		int pivotSelect = arr[high];
		int i = low - 1;

		for (int j = low; j < high; j++) { // small to the left
			if (arr[j] < pivotSelect) {
				i++;
				// swipe
				int temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
			}
		}
		// pivot in its correct position
		i++;
		int temp = arr[i];
		arr[i] = arr[high];
		arr[high] = temp;

		return i; // index of pivot

	}
}
