package Searching;

public class Exercise3 {

	public static void main(String[] args) {
		int[] arr = { 1, 8, 4, 67, 89, 16, 98, 43, 76, 23, 56 };
		int target = 43;

		System.out.println(linersearch(arr, target, 4, 8));

	}

	static int linersearch(int[] arr, int target, int i, int j) {
		if (arr.length == 0) {
			return -1;
		}

		for (int index = i; index < j; index++) {
			int element = arr[index];
			if (target == element) {
				return index;
			}
		}
		return -1;
	}

}
