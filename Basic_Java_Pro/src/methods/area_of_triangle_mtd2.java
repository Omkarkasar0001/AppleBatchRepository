package methods;

import java.util.Scanner;

public class area_of_triangle_mtd2 {  //classname
	public static void pf(int a,int b)     //methodname
	{
		int area1=(int)(0.5*a*b);
		System.out.println("Area of Triangle is: "+area1);
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Height and base respectively:  ");
		int a=sc.nextInt();
		int b=sc.nextInt();
		//Method Calling
		pf(a,b);//methodname(parameter without datatype);
		sc.close();
	}
	
	
}

