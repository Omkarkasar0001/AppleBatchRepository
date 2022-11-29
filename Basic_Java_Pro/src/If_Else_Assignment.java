import java.util.Scanner;

public class If_Else_Assignment {

	public static void main(String[] args) {
		/*
		 * float English = 80, Marathi = 80, History = 90, Math = 75, Science = 90, T,
		 * t, m; t = English + Marathi + History + Math + Science; // Total Obtained
		 * Mark..Marks are Out of 100 T = 500; // Total Marks m = t / T * 100;
		 * //Percentage System.out.println("Percentage:  " + m);
		 */
		int m;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The Percentage");
		m = sc.nextInt();

		if (m >= 0 && m <= 100)
			if (m >= 80 && m <= 100)
				System.out.println("Your Passed With A+ Grade");
			else if (m >= 60 && m <= 79)
				System.out.println("Your Passed With A Grade");
			else if (m >= 50 && m <= 59)
				System.out.println("Your Passed With B Grade");
			else if (m >= 40 && m <= 49)
				System.out.println("Your Passed With C Grade");
			else
				System.out.println("Sorry pls give again exam");

	}

}
