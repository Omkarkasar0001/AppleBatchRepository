package methods;

import java.util.Scanner;

public class Simple_Interest {
		
		void Si(int s)  //S=Salary
		{
			
			int r = 12 ,t,p;
			float Si=(float)( (p * r * t) / 100); 
			System.out.println("simple interest :"+Si);
		}
		
		
		public static void main(String[] args) {
			Scanner sc=new Scanner(System.in);
			int p;
		    System.out.println("Principal Amount");
		    p=sc.nextInt();								// Simple Interest
		    System.out.println("Time for u need loan -in Year");
		    int t;
		    System.out.println("Time");
		    t=sc.nextInt();	
		    Si SimpInt=new Si();
		    SimpInt.Si();
		
	}

}
