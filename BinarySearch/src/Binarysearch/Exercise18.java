package Binarysearch;

import java.util.Arrays;

public class Exercise18 {

	public static void main(String[] args) {
		int[][] arr= {
				{10,20,30,40},
				{11,21,31,41},
				{15,25,35,45},
				{17,27,37,47}
		};
		int target=25;
		//int[] ans=search(arr, target);
		 System.out.println(Arrays.toString(search(arr, target)));

	}
	static int[] search(int[][] matrix,int target){
		
		int row=0;
		int col=matrix.length-1;
		
		while(row<matrix.length && col>=0) {
			if(matrix[row][col]==target) {
				return new int[] {row,col};
			}
			if(matrix[row][col]<target) {
				row++;
			}else {
				col--;
			}
		}
		
		return new int[] {-1,-1};
	}

}
