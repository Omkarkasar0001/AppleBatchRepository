package Polymorphism_Written5;

import java.util.Scanner;

public class CompMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
        comp obj = new comp();
        
        System.out.print("Enter first integer: ");
        int n1 = sc.nextInt();
        System.out.print("Enter second integer: ");
        int n2 = sc.nextInt();
        obj.compare(n1, n2);
        
        System.out.print("Enter first character: ");
        char c1 = sc.next().charAt(0);
        System.out.print("Enter second character: ");
        char c2 = sc.next().charAt(0);
        sc.nextLine();
        obj.compare(c1, c2);

	}

}
