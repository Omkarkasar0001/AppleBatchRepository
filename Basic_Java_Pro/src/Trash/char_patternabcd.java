package Trash;

import java.util.Scanner;

public class char_patternabcd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the word to limit the Pattern (In Capitals) : ");
		// There is difference A-Z in Capitals and a-z in small case
		// Enter input carefully
		char c = sc.next().charAt(0);
		for (int i = 1; i <= c - 'A' + 1; i++) {
			for (int j = 1; j < i; j++) {
				System.out.print(" ");
			}
			for (char k = 'A'; k <= c - i + 1; k++) {
				System.out.print(k);
			}
			System.out.println();
		}
		sc.close();
	}

}
