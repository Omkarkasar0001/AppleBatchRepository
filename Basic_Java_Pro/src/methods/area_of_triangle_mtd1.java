package methods;

import java.util.Scanner;

public class area_of_triangle_mtd1 {
	
	void ara(int b,int h)   //void methodname(parameters)
	{
		int area=(int) (0.5*b*h);
		System.out.println("Area of Triangle is: "+area);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         Scanner sc=new Scanner(System.in);
         System.out.println("Enter base and Height Values respectively: ");
         int b=sc.nextInt();
        int  h=sc.nextInt();
        //Method Calling
         area_of_triangle_mtd1 yoyo=new area_of_triangle_mtd1();  //Classname Anyname=new Classname();
         yoyo.ara(b,h);                                         //Anyname.methodname(parameter without datatype)
         sc.close();
	}
	}
