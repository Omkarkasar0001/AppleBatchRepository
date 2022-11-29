package test2;

import java.util.Scanner;

public class q22 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=0,b=1,c;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter The number  : ");
		int num=sc.nextInt();
		for(int i=1;i<=num;i++) {
			System.out.println(" "+a);
			c=a+b;
			a=b;
			b=c;
			
		}
		

	}

}
