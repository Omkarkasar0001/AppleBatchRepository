package Test20_11;

import java.util.Scanner;

public class Q1_Fact {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Num");
		int num=sc.nextInt();
		int fact=1;
		for(int i=1;i<=num;i++)
		{
			fact=fact*i;
		}
		System.out.println(" "+fact);

	}

}
