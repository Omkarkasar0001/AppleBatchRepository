package self_Practice;
import java.util.Scanner;
public class Pattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Valuee ");
		int num=sc.nextInt();
      for(int i=1;i<=num;i++)       //Start;True;ibncremenet
      { 
      for(int j=1;j<=i;j++)
      {
    	  System.out.print("*");
      }
      System.out.println();
	}
	}
}
