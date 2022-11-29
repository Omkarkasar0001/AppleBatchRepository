package while_loop;

import java.util.Scanner;

public class Q6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i=1,sum=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter value:  ");
		int n=sc.nextInt();
		while(i<=n) 
		{
			if(i%2==0)
			{
				sum=sum+i;		
			}
			i++;
		}
		System.out.println("Sum of all even number of "+n+" is "+sum);
}
}