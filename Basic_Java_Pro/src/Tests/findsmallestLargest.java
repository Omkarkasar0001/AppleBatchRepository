package Tests;

import java.util.Scanner;

public class findsmallestLargest {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Number");
		int num=sc.nextInt();
		int smallest=num%10;
		int largest=num%10;
		while(num>0) {
			int remainder=num%10;
			
			if(smallest>remainder) {
				smallest=remainder;
			}
			if(largest<remainder) {
				largest=remainder;
			}
			num=num/10;
		}
		System.out.println(" "+largest);
		System.out.println(" "+smallest);
		sc.close();

	}
	

}
