package methods;

import java.util.Scanner;

public class EvenOdd1 {

	void findEvenOdd(int num) {
//method body  
		if (num % 2 == 0)
			System.out.println(num + " is even");
		else
			System.out.println(num + " is odd");
	}

	public static void main(String args[]) {
//creating Scanner class object     
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the number: ");
//reading value from user  
		int num = scan.nextInt();
//method calling  
		EvenOdd1 Yoyo=new EvenOdd1();    //Classname anyname=new Classname
		Yoyo.findEvenOdd(num);           //anyname.Methodname(Parameter without datatype);
		scan.close();
	}

	

	
	
	//user defined method  
}


//	public static void findEvenOdd(int num) 
//	{
//  	 Logic
//	}
//	public static void main(String args[]) 
//  {
//   Scanner sc=new Scanner(System.in);
//	   Syso("Enter the number: ");
//     int num = scan.nextInt();
//     findEvenOdd(num);         //Classname(parameter);