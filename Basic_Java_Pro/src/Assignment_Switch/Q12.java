package Assignment_Switch;

import java.util.Scanner;

public class Q12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int price = sc.nextInt();
		switch (price) {
		case 2:
			System.out.println("It is: 2");
			break;
		case 5:
			System.out.println("It is: 5");
			break;
		case 9:
			System.out.println("It is: 9");
			break;
		default:
			System.out.println("It is: default");

		}

	}

}
