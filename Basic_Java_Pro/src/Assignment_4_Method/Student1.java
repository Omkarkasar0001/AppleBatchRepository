package Assignment_4_Method;

import java.util.Scanner;

public class Student1 {
	int calculate(int s1, int s2, int s3) {
		int p=(s1+s2+s3)/3;
		return p;

	}
 void display(int p) {
	 System.out.println("Percentage  :  "+p);
	 if(p>=80 && p<=100) {
		 System.out.println("First Class");
	 }
	 else if(p>=60 && p<80){
		 System.out.println("Second Class");
	 }
	 else if(p>=40 && p<60){
		 System.out.println("Third Class");
	 }
	 else {
		 System.out.println("Failed");
	 }
	 
		 
 }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student1 s=new Student1();
		Scanner sc=new Scanner(System.in);
		System.out.println("Pls Enter Physics Marks");
		int s1=sc.nextInt();
		System.out.println("Pls Enter Math Marks");
		int s2=sc.nextInt();
		System.out.println("Pls Enter English Marks");
		int s3=sc.nextInt();
		int p=s.calculate(s1, s2, s3);
		s.display(p);

	}

}