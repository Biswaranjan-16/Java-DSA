package Binarysearch;

import java.util.Arrays;

public class Exercise5 {

	public static void main(String[] args) {
	int[][] arr= {
			{10,20,30,40},
			{11,22,33,44},
			{12,23,34,44},
			{13,24,35,45}
	};
	System.out.println(Arrays.toString(search(arr,34)));

	}

		static int[] search(int[][] arr, int target) {
		int row=0;
		int col=arr.length-1;
		
		while(row < arr.length && col >=0) {
			
			if(arr[row][col] == target) {
				return new int[] {row,col};
			}
			if(arr[row][col] < target) {
				row++;
			}else {
				col--;
			}
		}
		return new int[] {-1,-1};
	}

}
