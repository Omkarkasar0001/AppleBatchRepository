package while_loop;

import java.util.Scanner;

public class Q1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = 121, limit = 229;
		System.out.println("Even number are");

		while (i <= limit) {
			if (i % 2 == 0) {
				System.out.println(i + "");

			}
			i++;
		}

		System.out.println("Done");

	}

}
