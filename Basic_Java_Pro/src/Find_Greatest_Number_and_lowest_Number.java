
import java.util.Scanner;

public class Find_Greatest_Number_and_lowest_Number {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Values");
		int n1 = 20, n2 = 10, n3 = sc.nextInt();
		int i = 1;
		while(i<2)
		{
		if (n1 >= n2 && n1 >= n3) {
			System.out.println("n1 is Largest number  ");
			break;
		} else if (n2 >= n1 && n2 >= n3) {
			System.out.println("n2 is largest number");
			break;
		} else {
			System.out.println("n3 is largest number");
			break;
		}
		
		}
	}

}
