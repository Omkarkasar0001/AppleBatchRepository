package asssignement_3_Classes_and_object;

import java.util.Scanner;

public class Q3 {
	public static void country(String sname)
	{
		switch(sname) 
		{
		case "india":
			System.out.println("Hockey");
			break;
		case "china":
		 System.out.println("Table Tennis");
		 break;
		case "bangladesh":
			 System.out.println("Kabaddi");
			 break;
		case "italy":
			 System.out.println("Football");
			 break;
		case "united states":
			 System.out.println("Baseball");
			 break;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String sname;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Country's Name");
		sname=sc.nextLine();
		sname=sname.toLowerCase();
		//Method Calling
		country(sname);
		sc.close();
     
	}

}
