package BubbleSort;

import java.util.Arrays;

public class Exercise2 {

	public static void main(String[] args) {
		int[] arr= {54,90,65,23,1,4,34,98};
		sort(arr);
		System.out.println(Arrays.toString(arr));

	}

	 static void sort(int[] arr) {
		boolean swapped;
		for(int i=0;i<arr.length;i++) {
			swapped =false;
			for(int j=i;j<arr.length-1;j++) {
				if(arr[j] < arr[j-1]) {
					int temp=arr[j];
					arr[j] =arr[j-1];
					arr[j-1]=temp;
					swapped=true;
				}
			}
			if(!swapped) {
				break;
			}
			
		}
		
	}

}
