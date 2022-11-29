package Practice;

import java.util.Scanner;

public class factorial_of_num {     //5!= 5*4*3*2*1=120

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num,i,fact=1;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Number");
		num=sc.nextInt();
		for(i=1;i<=num;i++)    //1              2              3         4             5
		{
			fact=fact*i;     // fact=1*1=1    fact=1*2=2   fact=2*3=6   fact=6*4=24  fact=24*5=120
		}
		System.out.println("Factorial of number is : "+fact);  //Last Updated Value fact=120
		
	}

}
