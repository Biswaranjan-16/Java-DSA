package Binarysearch;

public class Exercise1 {

	public static void main(String[] args) {
		int[] arr = { 10, 20, 30, 40, 50, 56, 67, 78, 87, 90, 99 };
		int target = 90;
		int ans = binarysearch(arr,target);
		System.out.println(ans);

	}

	static int binarysearch(int[] arr,int target) {
		int start = 0;
		int end = arr.length - 1;
		while (start <= end) {
			int mid = start + (end - start) / 2;

			if (target < arr[mid]) {
				end = mid - 1;
			} else if (target > arr[mid]) {
				start = mid + 1;
			} else {
				return mid;
			}
		}

		return -1;
	}

}
