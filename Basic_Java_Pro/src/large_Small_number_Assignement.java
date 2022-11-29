import java.util.Scanner;

public class large_Small_number_Assignement{

	public static void main(String[] args) {
		double n1, n2, n3, n4 = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the First Number: ");
		n1 = sc.nextDouble();

		System.out.println("Enter the Second Number: ");
		n2 = sc.nextDouble();

		System.out.println("Enter the Third Number: ");
		n3 = sc.nextDouble();

		System.out.println("Enter the Fourth Number: ");
		n4 = sc.nextDouble();

		if (n1 >= n2 && n1 >= n3 && n1 >= n4) {
			System.out.println("n1 is largest " + n1);
		} else if (n1 <= n2 && n1 <= n3 && n1 <= n4) {
			System.out.println("n1 is small " + n1);
		}
		if (n2 >= n1 && n2 >= n3 && n2 >= n4) {
			System.out.println("n2 is largest " + n2);
		} else if (n2 <= n1 && n2 <= n3 && n2 <= n4) {
			System.out.println("n2 is Smallest " + n2);
		}
		if (n3 >= n1 && n3 >= n2 && n3 >= n4) {
			System.out.println("n3 is Largest " + n3);
		} else if (n3 <= n1 && n3 <= n2 && n3 <= n1) {
			System.out.println("n3 is Smallest " + n3);
		}
		if (n4 >= n1 && n4 >= n2 && n4 >= n3) {
			System.out.println("n4 is Largest " + n4);
		} else {
			System.out.println("n4 is Smallest " + n4);
		}
		sc.close();

	}

}
