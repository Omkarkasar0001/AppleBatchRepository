package while_loop;

import java.util.Scanner;

public class While_Loop_Expri {

	public static void main(String[] args) {
		int i = 0;
		int sum = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Values ");

		i = sc.nextInt();

		while (i <= 5) {
			{
				sum += i;
				System.out.println(sum + "");
			}

			i++;

		}
		System.out.println("Done");

		sc.close();

	}
}
