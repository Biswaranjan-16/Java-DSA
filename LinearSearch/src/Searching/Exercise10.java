package Searching;

public class Exercise10 {

	public static void main(String[] args) {
		int[] arr = { 2, 3, 4, 10, 40 };
		int target = 40;
		int result = search(arr,target);
		if (result == -1) {
			System.out.println("target is not available in array");
		} else {
			System.out.println("target available at " + result + " index");
		}

	}

	static int search(int[] arr, int target) {
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == target) {
				return i;
			}

		}
		return -1;
	}

}
