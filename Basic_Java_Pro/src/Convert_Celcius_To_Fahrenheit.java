import java.util.Scanner;

public class Convert_Celcius_To_Fahrenheit {

	public static void main(String[] args) {
		float c, f;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Celcius Temp");
		c = sc.nextFloat();
		/*
		 * c =24; // Temp in Celcius
		 */ f = ((c * 9) / 5) + 32; // Fahrenheit Formula
		System.out.println("Temprature in Fahrenheit :  " + f);

	}

}
