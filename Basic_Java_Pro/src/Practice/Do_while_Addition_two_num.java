package Practice;

import java.util.Scanner;

public class Do_while_Addition_two_num {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      int a,b;
      char ch;
      
      do
      {
    	  Scanner sc=new Scanner(System.in);
          System.out.println("Enter Two Numbers:  ");
          a=sc.nextInt();
          b=sc.nextInt();
          System.out.println("Addition of Two number:"+(a+b));
          System.out.println("Do u want to continue y/n");
          ch = sc.next().charAt(0);
      }
         while(ch =='Y' || ch=='y');
         System.out.println("Thank You");
	}
      
}
