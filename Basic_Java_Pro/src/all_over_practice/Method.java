package all_over_practice;

import java.util.Scanner;

public class Method {
	void oddOReven(int num){
		if(num%2==0) {
			System.out.println("Even");
		}
		else {
			System.out.println("Odd");
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner (System.in);
		System.out.println("ENter Number");
		int num=sc.nextInt();
		Method m1=new Method();
		m1.oddOReven(num);

	}

}
