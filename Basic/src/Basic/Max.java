package Basic;

import java.util.Scanner;

public class Max {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first number : ");
		int a = sc.nextInt();
		System.out.println("Enter second number : ");
		int b = sc.nextInt();
		System.out.println("Enter third number : ");
		int c = sc.nextInt();

		int max = a;
		if (b > max) {
			max = b;
		}
		if (c > max) {
			max = c;
		}
		System.out.println("Maximum number is : " + max);
	}

}
