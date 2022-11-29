package Trash;

import java.util.Scanner;

//Method with No Argument & No return value

public class Test3 {
	
	static void Volume(){
		double r,h,v;
/* final */ double Pi=3.14;
   Scanner sc=new Scanner(System.in);
   System.out.println("Enter The Radius :  ");
    r=sc.nextDouble();
    System.out.println("Enter The Height :  ");
    h=sc.nextDouble();
    
    v=Pi*r*r*h;
    System.out.println("Volume of Cylinder  :"+v);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	  Volume();

	}

}
