package methods;

import java.util.Scanner;

public class pfsalary {
	public static void pf(int s)  //S=Salary
	{
		
		float p=(float) (s*0.15);  //S=50000*1.15=57500  ... S-s=57500-50000=7500
		System.out.println("PF is :"+p);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		
	    System.out.println("Enter Salary");
	   int  s=sc.nextInt();
	  //method calling  
	   pf(s);   //method(parameter);
	    		}
	}


