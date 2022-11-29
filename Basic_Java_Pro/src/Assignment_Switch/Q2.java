package Assignment_Switch;

import java.util.Scanner;

public class Q2 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int num = sc.nextInt();
		switch (num % 2) {// this will return 0
		case 0:
			System.out.println(num + " is an Even number");
			break;
		case 1:
			System.out.println(num + " is an Odd number");
		}
	}

}
