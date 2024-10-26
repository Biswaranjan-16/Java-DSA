package Basic;

import java.util.Scanner;

public class First {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the temperature in celcius : ");
		Float tempC=sc.nextFloat();
		
		Float tempF=(tempC * 9/5)+32;
		System.out.println("Temperature ion Farenheit : " +tempF);

	}

}
