package self_Practice;

import java.util.Scanner;

public class Num_Pattern2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i,j,n;
 		Scanner sc = new Scanner(System.in);
    		System.out.println("Enter the no of lines");
 		n=sc.nextInt();
    		for(i=1;i<=n;i++)
    		{
        		for(j=1;j<=i;j++)
        		{
        			System.out.print(i);
        		}
 
        		System.out.println("");
    		}
	}

}
