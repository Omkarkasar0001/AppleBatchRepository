package Assignment_While_Loop;

import java.util.Scanner;

public class While_Loop_Even_Number_Sum_assign {

	public static void main(String[] args) {
		int i = 0,Sum = 1 ,limit;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Limit ");

		limit = sc.nextInt();
		System.out.println("Even number are");

		while (i <= limit) {
			if (i % 2 == 0 ) {
				System.out.println(i + "");
              Sum+=i;
			}
			i++;
		}

		System.out.println("Done");
		System.out.println("Sum of All Even Number are :"+Sum);

		sc.close();

	}
}
