package Tests;

import java.util.Scanner;

public class Swapping {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter X and Y values");
		int x=sc.nextInt();  //55
		int y=sc.nextInt();  //45
		int t;
		 t=x;  //t=55
		x=y;   //y=55
		y=t;  //t=55
		System.out.println(" "+t);  //t=55
				

	}

}
