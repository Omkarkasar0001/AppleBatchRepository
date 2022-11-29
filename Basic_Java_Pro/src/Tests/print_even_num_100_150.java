package Tests;

import java.util.Scanner;

public class print_even_num_100_150 {

	public static void main(String[] args) {
		int i = 200;
		int limit = 250;
		while (i <= limit) {
			if (i % 2 != 0) {
				System.out.print(" " + i);
			}

			i++;

		}
	}
}
