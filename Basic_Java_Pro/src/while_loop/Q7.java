package while_loop;

import java.util.Scanner;

public class Q7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = 1, sum = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter value:  ");
		int n = sc.nextInt();
		while (i <= n) {                               
			if (i % 2 != 0)             //Condition for odd number pls refer previews even number program
			{
				sum = sum + i;
			}
			i++;
		}
		System.out.println("Sum of all Odd number of " + n + " is " + sum);
	}
}
