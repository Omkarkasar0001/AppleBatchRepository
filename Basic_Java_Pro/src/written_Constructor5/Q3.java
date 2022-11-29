package written_Constructor5;

import java.util.Scanner;

public class Q3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int count=1;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a Number");
		int num=sc.nextInt();
		for(int i=num; i>=1; i-- ){//outer for loop(parent)
			 for(int j=1; j<=i*2; j++){
			 System.out.print(" ");//create space from te begining of each row
			 }//inner for loop 1(child)a
			 for(int j=i; j<=num; j++){//print right part of Piramid
			 System.out.print(j+" ");
			 }//inner for loop 2
			for(int j=num-1; j>=i; j--){
			 System.out.print(j+" "); //print left part of Piramid
			 }//inner for loop 3
			  System.out.println();
			count++;//count increse with 1
			
			//
	}
}
}