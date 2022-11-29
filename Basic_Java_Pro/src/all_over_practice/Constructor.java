package all_over_practice;

import java.util.Scanner;

public class Constructor{
	
int id;

	Constructor(int id){
     this.id=id;
	}


	void display(){
	System.out.println(" "+id);
	}


	public static void main(String[]args){
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter ur ID");
	int i=sc.nextInt();
	Constructor a1=new Constructor(i);
	a1.display();
	}
}