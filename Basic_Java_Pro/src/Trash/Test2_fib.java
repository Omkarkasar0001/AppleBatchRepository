package Trash;

import java.util.Scanner;

public class Test2_fib {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 0, b = 1;                                //a is first term & b is second term
		Scanner sc = new Scanner(System.in);             //Taking Input
		System.out.println("Fibnacci Series til : ");    //Statement
		int num = sc.nextInt();                          //Reading input
		for (int i = 1; i <= num; i++) {                 //1,2,3,4,5,6,7,8,9,10 Number of digit
			System.out.print(a + " ");                  // 0 ,
			// Compute the Next Term                     // i=1            i=2
			int c = a + b;                        //nextTerm=0+1=1   1+1=2
			a = b;                                       //a=1,b=1          a=2,b=2 
			b = c;                                //b=1               b=2
			sc.close();                                  //nextTerm=1
		}
	}

}
// 0,
//