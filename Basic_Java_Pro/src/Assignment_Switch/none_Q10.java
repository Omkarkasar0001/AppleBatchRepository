package Assignment_Switch;

import java.util.Scanner;

public class none_Q10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int n1 = sc.nextInt();
		int n2 = sc.nextInt();
		switch (n1>n2) {
		case 0:
		  System.out.println(""+n2);;
		  break;
		case 1:
		  System.out.println(" "+n1);
		 break;
		}
	}
}
	
