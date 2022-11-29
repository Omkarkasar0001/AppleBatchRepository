package asssignement_3_Classes_and_object;

import java.util.Scanner;

public class Q2 {
	void star() 
	{
		int i,j,rows;
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the number of rows: ");
		rows=sc.nextInt();
		
		for(  i=1;i<=rows;i++)
		{
			for( j=1;j<=i;j++)
			{
				System.out.print("*");
			}
			System.out.println(" ");
		}
	}
	void numpattern() 
	{
		int i,j,rows;
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the number of rows for number pattern: ");
		rows=sc.nextInt();
		for(i=1; i<=rows; i++){
		  for(j=1; j<=i; j++){
		  if(i%2==1){
		      System.out.print("0");
		  }
		  else{
		      System.out.print("1");
		  }
		}
		  System.out.println();
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Q2 any= new Q2();  //Classname Anyname=new Classname
		any.star();        //anyname.Methodname(no arguments);
		System.out.println("");
		
		Q2 any11=new Q2();
		any11.numpattern();
		
		

	}

}
