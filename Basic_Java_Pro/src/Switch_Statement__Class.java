import java.util.Scanner;

public class Switch_Statement__Class {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Character: ");
		char ch = sc.next().charAt(0);
		switch (ch) {

		/*
		 * case 'a' | 'A': System.out.println("Vowel"); break; case 'e' | 'E':
		 * System.out.println("Vowel"); break; case 'i' | 'I':
		 * System.out.println("Vowel"); break; case 'o' | 'O':
		 * System.out.println("Vowel"); break;
		 */
		case 'a' :
		case 'e' :
		case 'i' :
		case 'o' :
		case 'u' :
			System.out.println("Vowel");
			break;
		default:
			System.out.println("Consonant");

		}

	}

}
