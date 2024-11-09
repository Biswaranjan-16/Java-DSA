package Searching;

public class Exercise8 {

	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4 };
		int target = 3;
		System.out.println(linearsearch(arr, target));

	}

	static int linearsearch(int[] arr, int target) {
		if (arr.length == 0) {
			return -1;
		}
		for (int i = 0; i < arr.length; i++) {
			int element = arr[i];
			if (target == element) {
				return i;
			}
		}
		return -1;
	}

}
