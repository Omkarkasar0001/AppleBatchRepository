import java.util.Scanner;

public class ElseIfExample {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Your Marks");
		int m = sc.nextInt();
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
