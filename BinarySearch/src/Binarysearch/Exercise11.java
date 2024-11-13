package Binarysearch;

public class Exercise11 {
	

		public static void main(String[] args) {
			int[] arr = { 99, 88, 88, 77, 66, 55, 44, 33, 22, 11 };
			int target = 22;
			System.out.println(binarysearch(arr, target));

		}

		static int binarysearch(int[] arr, int target) {
			int start = 0;
			int end = arr.length - 1;
			boolean isAsc = arr[start] < arr[end];
			
			while (start <= end) {
				int mid = start + (end - start) / 2;
				
				if (arr[mid] == target) {
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


