package Assignment_Switch;

import java.util.Scanner;

public class Q15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int k = sc.nextInt();
		switch (k) {
		default:
			System.out.print("Website");
			break;
		case 65:
			System.out.print("Merit");	
			break;
		case 'k':
			System.out.print("Campus");
			break;
		case 'j':
			System.out.print("Java");
			

		}

	}
}
