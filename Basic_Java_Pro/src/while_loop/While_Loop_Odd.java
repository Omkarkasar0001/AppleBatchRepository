package while_loop;

import java.util.Scanner;

public class While_Loop_Odd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int i = 0, limit;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Limit ");

		limit = sc.nextInt();
		System.out.println("ODD number are");

		while (i <= limit) {
			if (i % 2 != 0) {
				System.out.println(i + "");

			}
			i++;
		

		    
				if (i % 2 == 0) {
					System.out.println(i + "");

				}
				i++;
			}
			sc.close();

		}
	}
