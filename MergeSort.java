package codemon;

public class MergeSort {

	private static void Divide(int[] array) {
		int length = array.length;

		if (length <= 1) {
			return;
		}

		int middle = length / 2;
		int[] leftArray = new int[middle];
		int[] rightArray = new int[length - middle];

		int i = 0;
		int j = 0;

		for (; i < length; i++) {
			if (i < middle) {
				leftArray[i] = array[i];
			} else {
				rightArray[j] = array[i];
				j++;
			}
		}
		Divide(leftArray);
		Divide(rightArray);
		Conquer(leftArray, rightArray, array);
	}

	private static void Conquer(int[] leftArray, int[] rightArray, int[] array) {
		int leftSize = array.length / 2;
		int rightSize = array.length - leftSize;

		int i = 0;
		int l = 0;
		int r = 0;

		while (l < leftSize && r < rightSize) {
			if (leftArray[l] < rightArray[r]) {
				array[i] = leftArray[l];
				i++;
				l++;
			} else {
				array[i] = rightArray[r];
				i++;
				r++;
			}
		}

		while (l < leftSize) {
			array[i] = leftArray[l];
			i++;
			l++;
		}
		while (r < rightSize) {
			array[i] = rightArray[r];
			i++;
			r++;
		}
	}

	public static void main(String[] args) {
		int[] nums = { 4, 32, 54, 32, 2, 32, 35, 346, 756, 445532, 5, 6, 34, 52547, 345 };
		System.out.println("Before sorting :");
		for (int num : nums) {
			System.out.print(num + " ");
		}
		System.out.println();

		// method calling
		Divide(nums);

		System.out.println("After the sorting alglorithm");
		for (int num : nums) {
			System.out.print(num + " ");
		}
	}

}
