package Assignment_Switch;

import java.util.Scanner;

public class Q13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int code = sc.nextInt();

		switch (code) {
		case 1:
			System.out.println("Wish");
		case 2:
			System.out.println("You");
		default:
			System.out.println("A");
		case 3:
			System.out.println("Happy");
		case 4:
			System.out.println("New");
		case 5:
			System.out.println("Year");
		}

	}
}