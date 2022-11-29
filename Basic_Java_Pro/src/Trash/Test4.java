package Trash;

import java.util.Scanner;

public class Test4 {
//Method with No Argument but with Return value
//Find area of square
	
	static int area(){
		 int l,b,h,v;
		 Scanner sc=new Scanner(System.in);
		 System.out.println("Enter the lenght");
		 l=sc.nextInt();
		 System.out.println("Enter the widght");
		 b=sc.nextInt();
		 System.out.println("Enter the height");
		 h=sc.nextInt();
		 v=l*b*h;
		 return v;
	 }
	
	
	
	
	public static void main(String []args) {
		int v=area();
		System.out.println("Volume is :"+v);
	}

}
