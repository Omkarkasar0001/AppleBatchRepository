package Assignment1;

import java.util.Scanner;

public class Power_Of_Number {

	public static void main(String[] args) { 
		int b, e;  
		Scanner sc = new Scanner(System.in);  
		System.out.println("Enter the base: ");  
		b = sc.nextInt();  
		System.out.println("Enter the exponent: ");  
		e = sc.nextInt();  
		//invokes the pow() method of the Math class  
		double power = Math.pow(b, e);  
		//prints result  
		System.out.println(b +" to the power " +e + " is: "+power);  
		}  
		
	}


