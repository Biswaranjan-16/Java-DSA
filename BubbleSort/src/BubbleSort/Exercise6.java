package BubbleSort;

import java.util.Arrays;

public class Exercise6 {

	public static void main(String[] args) {
	int[] arr= {9,3,5,0,1,4,3,6,7,2,4,5};
	bubblesort(arr);
	System.out.println(Arrays.toString(arr));

	}
	static void bubblesort(int[] arr) {
		for(int i=0;i<arr.length;i++) {
			for(int j=1;j<arr.length-i;j++) {
				if(arr[j]<arr[j-1]) {
					int temp=arr[j];
					arr[j]=arr[j-1];
					arr[j-1]=temp;
				}
			}
		}
	}

}
