package Assignment1;

import java.util.Scanner;

public class Sqrt_of_number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Value: ");
		num = sc.nextInt();
		double sqrt = Math.sqrt(num);    // Formula used in java
		// prints result
		System.out.println(" Square Root of  " + num + "  is: " + sqrt);
	}

}
