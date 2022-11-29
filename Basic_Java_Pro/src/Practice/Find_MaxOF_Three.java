package Practice;

import java.util.Scanner;

public class Find_MaxOF_Three {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a,b,c,max,temp;
		Scanner sc=new Scanner (System.in);
		System.out.println("Enter First value ");
		a=sc.nextInt();
		System.out.println("Enter Sec value ");
		b=sc.nextInt();
		System.out.println("Enter Third value ");
		c=sc.nextInt();
		
			
			if(a>=b && a>=c)
			{
				System.out.println("a is large");
			}
			else if(b>=a && b>=c)
			{
				System.out.println("b is large");
			}
			else				
				System.out.println("C is large");
				
		}
		
		
}