package Practice;

import java.util.Scanner;

public class For_loop_Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i, n, Facto = 1;    
		Scanner sc = new Scanner(System.in);  // Input Scanning ON
		n = sc.nextInt();                     //Input Suppose n=5
	
		for (i = 1; i <= n; i++) {            //(initialization;Condition;Increment)
			
			
			Facto = Facto * i;  //Facto=Facto*i=Facto  //1*1=1 //1*2=2  //2*3=6 //6*4=24  //24*5=120 
			
			
			
			System.out.println(Facto + "");  // Facto=1,2,6,24,120
		}
	}

}
