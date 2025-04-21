package Searching;

import java.util.Arrays;

public class Exercise15 {

	public static void main(String[] args) {
		int[][] arr = { { 12, 45, 87, 45 }, 
				        { 24, 90, 76, 50 }, 
				        { 91, 62, 73, 83 }, 
				        { 14, 55, 61 }, 
				        };
		int target = 55;
		int ans = max(arr);
		System.out.println(ans);

	}

	static int max(int[][] arr) {
		int max=Integer.MIN_VALUE;
		for (int row = 0; row < arr.length; row++) {
			for (int column = 0; column < arr[row].length; column++) {
				if (arr[row][column] >max) {
					max=arr[row][column];
				}
			}
		}

		return max;
	}

}
