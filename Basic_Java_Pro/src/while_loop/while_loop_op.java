package while_loop;

import java.util.Scanner; //java.util.Scanner;

public class while_loop_op{
		public static void main(String[]args)   //S capital of String
		{
		int i = 0,limit;                         //Forgotten Initializatio of Variable i=0
		Scanner sc=new Scanner(System.in);
		System.out.println("Pls Enter Limit");
		limit=sc.nextInt();
		System.out.println("Even Number are:");
		while(i<=10)
		{
		if (i%2==0)
		{
		System.out.println(i+"");
		}
		i++;
		}
		System.out.println("Done");
		sc.close();
		}
		}
