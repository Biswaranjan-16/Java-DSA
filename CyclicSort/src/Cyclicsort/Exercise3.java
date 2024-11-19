package Cyclicsort;

import java.util.Arrays;

public class Exercise3 {

	public static void main(String[] args) {
		int[] arr= {9,8,6,7,3,1,5,2,4};
		cyclesort(arr);
		System.out.println(Arrays.toString(arr));

	}

	 static void cyclesort(int[] arr) {
		int i=0;
		while(i < arr.length) {
			int correct=arr[i] - 1;
			if(arr[i] !=arr[correct]) {
				swap(arr,i,correct);
			}else {
				i++;
			}
		}
		
	}

	 static void swap(int[] arr, int i, int correct) {
		int temp=arr[i];
		arr[i]=arr[correct];
		arr[correct]=temp;
		
	}

}
