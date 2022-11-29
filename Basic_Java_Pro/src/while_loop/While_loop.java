package while_loop;

import java.util.Scanner;

public class While_loop {

	public static void main(String[] args) {
		int i = 1,limit;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter The Limit:  ");
		limit=sc.nextInt();
		
		while(i<=limit)
		{
			System.out.print(i+" ");
			i++;
		}
		System.out.println("Done");
		sc.close();

	}

}
