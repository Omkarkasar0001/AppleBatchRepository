package Practice;

import java.util.Scanner;

public class Do_While_Add_Mult_Sub_Divi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a,b;
		char ch1;
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter Two Number: ");
		a=sc.nextInt();
		b=sc.nextInt();
		
		do {
		System.out.println("\n1 Addition \n2 Substration \n3 Multiplication \n4 Divition");
		System.out.println(" Enter Your Choice: ");
		int ch=sc.nextInt();
		
		switch (ch)
		{
		case 1:
			System.out.println("Enter Two Number For Addition :");
			System.out.println("Addition is:"+(a+b));
		case 2:
			System.out.println("Enter Two Number For Substration :");
			System.out.println("Substration is:"+(a-b));
		case 3:
			System.out.println("Enter Two Number For Multiplication :");
			System.out.println("Substration is:"+(a*b));
		case 4:
			System.out.println("Enter Two Number For Divition :");
			System.out.println("Divition is:"+(a/b));
			default:
				System.out.println("Eneter Valid option: ");
	}
		System.out.println("Do you Want to continue  (y/n): ");
		ch1=sc.nextInt().charAt(0);
		}
		 while(ch1 =='Y' || ch=='y');
        System.out.println("Thank You");
}
