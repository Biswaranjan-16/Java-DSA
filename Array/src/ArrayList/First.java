package ArrayList;

import java.util.Arrays;
import java.util.Scanner;

public class First {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int[] a= new int[3];
		
		for(int i=0;i<a.length;i++) {
			a[i]=sc.nextInt();
		}
		System.out.println(Arrays.toString(a));
//		for(int i=0;i<a.length;i++) {
//			System.out.print(a[i]+" ");
//		}
		
	//	System.out.println(a[2]);

	}

}
