package Searching;

public class Exercise4 {

	public static void main(String[] args) {
		int[] arr = { 34, 98, 45, 24, 90, 54, 2, -8 };
		System.out.println(min(arr));

	}

	static int min(int[] arr) {
		if (arr.length == 0) {
			return -1;
		}
		int ans = arr[0];
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] < ans) {
				ans = arr[i];
			}
		}
		return ans;
	}

}
