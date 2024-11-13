package BubbleSort;

import java.util.Arrays;

public class Exercise3 {

	public static void main(String[] args) {
		int[] arr= {3,4,6,9,2,5,9,7,5};
		bubblesort(arr);
		System.out.println(Arrays.toString(arr));

	}

	private static void bubblesort(int[] arr) {
		boolean swapped;
		for (int i = 0; i < arr.length; i++) {
			swapped =false;
			for(int j=1;j<arr.length;j++) {
				if(arr[j] < arr[j-1]) {
					int temp=arr[j];
					arr[j]=arr[j-1];
					arr[j-1]=temp;
					swapped= true;
				}
			}
			if(!swapped) {
				break;
			}
		}
		
		
	}

}
