package methods;

import java.util.Scanner;

public class calci{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		calci c1 = new calci();
		calci c2 = new calci();
		c1.add();
		c2.substract();

	}

	void add() {
		int a,b;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Two Number");
		a=sc.nextInt();
		b=sc.nextInt();
		System.out.println("Adddition is: "+(a+b));
		
	}
	void substract()
	{
		int a,b;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Two Number");
		a=sc.nextInt();
		b=sc.nextInt();
		System.out.println("Substraction is: "+(a-b));
		
	}
	

}
