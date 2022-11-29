package test2;

import java.util.Scanner;

public class q1 {
	public static void main(String[] a) {
		int num = 121;
		int output = 0;
		int temp = num;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		num = sc.nextInt();
		while (num > 0) {
			int reminder = num % 10;
			num = num / 10;
			output = output * 10 + reminder;
		}
		System.out.println("Palindrome number: " + output);
		{
		if (temp == output) {
			System.out.println("Palindrome");
		} else {
			System.out.println("Not Pallndrome");
		}

	}
	}
}
