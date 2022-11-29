package methods;

import java.util.Scanner;

public class None{
	void add(int a, int b )
	{
		System.out.println("Addition is : "+(a+b));
		
		
	}
	void subtract(int a, int b)
	{
		
		
		System.out.println("Substraction is is : "+(a-b));
		
	}

	public static void main(String[] args) {
		// Method Calling
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Two Number");
		int a=sc.nextInt();
		int b=sc.nextInt();
		None any=new None();    //Classname any=new Classname();
		any.add(a, b);
		any.subtract(a,b);
		// Method Calling (another way just add public static to above each methods)
		//add();           methodname(Parameter without Variable);             
		//subtract();      methodname(Parameter without Variable);

	}

}
