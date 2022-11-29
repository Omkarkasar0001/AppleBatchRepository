package methods;

import java.util.Scanner;

public class EvenOdd2 {


	// user defined method
	public static void findEvenOdd() {
		// method body
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the number: ");
		// reading value from user
		int num = scan.nextInt();
		// method calling
		if (num % 2 == 0)
			System.out.println(num + " is even");
		else
			System.out.println(num + " is odd");
		scan.close();

	}
	public static void main(String args[]) {

		//Method Calling
		findEvenOdd(); //Methodname(no arguments);
	}
}

//p=5;p>=i;p--