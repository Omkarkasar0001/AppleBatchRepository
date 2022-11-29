package while_loop;

import java.util.Scanner;

public class While_Loop_Even_assign {

	public static void main(String[] args) {
		int i = 0, limit;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Limit ");

		limit = sc.nextInt();
		System.out.println("Even number are");

		while (i <= limit) {
			if (i % 2 == 0) {
				System.out.println(i + "");

			}
			i++;
		}

		System.out.println("Done");

		sc.close();

	}
}
