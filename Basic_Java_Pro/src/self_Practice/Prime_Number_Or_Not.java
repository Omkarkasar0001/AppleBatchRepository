package self_Practice;

import java.util.Scanner;

public class Prime_Number_Or_Not {

	public static void main(String[] args) {

		int i, number, count = 0;
		Scanner sc= new Scanner(System.in);

		System.out.print(" Please Enter any Integer : ");
		number= sc.nextInt();

		for (i=2;i<=number/2;i++) { // (number=11;i<number/2;i++)
			if (number% i==0) { // 11%2==0.22 false
				count++;
				break;
			}
		}
		if (count==0 && number!=1) { // True   //true
			System.out.println(number + " is a Prime");
		} else 
		{
			System.out.println(number + " is Not");
		}
	}

}
