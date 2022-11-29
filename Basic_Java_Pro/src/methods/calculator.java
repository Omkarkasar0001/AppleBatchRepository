package methods;

import java.util.Scanner;

public class calculator {
	
	
	void add()
	{
		int a,b;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Two Number");
		a=sc.nextInt();
		b=sc.nextInt();
		System.out.println("Adddition is: "+(a+b));
		
	}
	
	void Subtract()
	{
		int a,b;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Two Number");
		a=sc.nextInt();
		b=sc.nextInt();
		System.out.println("Substraction is: "+(a-b));
		
	}
	
	void Mult()
	{
		int a,b;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Two Number");
		a=sc.nextInt();
		b=sc.nextInt();
		System.out.println("Multiplication is: "+(a*b));
		
	}
	
	void divition()
	{
		int a,b;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Two Number");
		a=sc.nextInt();
		b=sc.nextInt();
		System.out.println("divition is: "+(a/b));
		
	}

}
