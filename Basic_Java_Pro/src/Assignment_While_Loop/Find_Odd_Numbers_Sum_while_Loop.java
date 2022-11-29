package Assignment_While_Loop;

import java.util.Scanner;

public class Find_Odd_Numbers_Sum_while_Loop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = 0,Sum = 1 ,limit;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Limit ");

		limit = sc.nextInt();
		System.out.println("Odd number are");

		while (i <= limit) {
			if (i % 2!= 0 ) {
				System.out.println(i + "");
              Sum+=i;
			}
			i++;
		}

		System.out.println("Done");
		System.out.println("Sum of All Odd Number are :"+Sum);

		sc.close();
	}

}
