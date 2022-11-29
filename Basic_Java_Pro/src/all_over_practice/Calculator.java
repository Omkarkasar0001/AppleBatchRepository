package all_over_practice;

import java.util.Scanner;
//Method Program
public class Calculator {
	void add() {
		Scanner sc = new Scanner(System.in);
		System.out.println(" Enter value of a and b resp....");
		int a = sc.nextInt();
		int b = sc.nextInt();
		System.out.println(" addition is    " + (a + b));
	}

	void substration() {
		Scanner sc = new Scanner(System.in);
		System.out.println(" Enter value of a and b resp....");
		int a = sc.nextInt();
		int b = sc.nextInt();
		System.out.println(" substration is   " + (a - b));
	}

	public static void main(String[] args) {
		Calculator c1 = new Calculator();
		c1.add();
		System.out.println();
		c1.substration();

	}

}