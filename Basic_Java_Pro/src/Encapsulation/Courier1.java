package Encapsulation;

import java.util.Scanner;
//Using Contructor and display
public class Courier1 {
	int weight;
	String Subject;
Courier1(int weight,String Subject){
	this.weight=weight;
	this.Subject=Subject;	
}
public void display() {
	System.out.println(weight+" "+Subject);
}

public static void main(String[]args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter Weight of Courier packet");
	int w=sc.nextInt();
	System.out.println("Enter Subject of Courier ");
	String sub=sc.next();
	Courier1 c1=new Courier1(w, sub);
	c1.display();
	
	
	
}

}
