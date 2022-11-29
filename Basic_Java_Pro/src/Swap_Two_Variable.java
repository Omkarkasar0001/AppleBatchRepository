import java.util.Scanner;

public class Swap_Two_Variable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x, y, t;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value of X and Y");
		x = sc.nextInt();
		y = sc.nextInt(); // Capital "I" and "()"
		System.out.println("before swapping numbers: " + x + " " + y);
		/* Swapping */
		t = x;
		x = y;
		y = t;
		System.out.println("After swapping: " + x + " " + y);

	}

}
