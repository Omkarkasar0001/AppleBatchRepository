package Assignment_Switch;
import java.util.Scanner;

public class Q1_Switch___Statement_Number_Of_Days_In_Month_Assign {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Month number");
		int num = sc.nextInt();
		switch (num) {
		case 1:

		case 3:

		case 5:

		case 7:

		case 8:

		case 10:

		case 12:
			System.out.println("31 days");
			break;

		case 4:

		case 6:

		case 9:

		case 11:
			System.out.println("30 days");
			break;
		case 2: {
			System.out.println("28/29 days");
		}
			break;

		}

	}

}
