package Binarysearch;

public class Exercise4 {

	public static void main(String[] args) {
		int[] arr = { 23, 34, 56, 65, 76, 78, 87, 99 };
		int target = 87;
		int ans = search(arr, target);
		System.out.println(ans);
	}

	static int search(int[] arr, int target) {
		int start = 0;
		int end = arr.length - 1;

		boolean isAsc = arr[start] < arr[end];

		while (start <= end) {
			int mid = start + (end - start) / 2;

			if (target == arr[mid]) {
				return mid;
			}
			if (isAsc) {
				if (target < arr[mid]) {
					end = mid - 1;
				} else {
					start = mid + 1;
				}
			} else {
				if (target > arr[mid]) {
					end = mid - 1;
				} else {
					start = mid + 1;
				}
			}
		}
		return -1;
	}

}
