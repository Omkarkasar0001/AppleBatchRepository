package methods;

import java.util.Scanner;

public class Student {
	int ID;           //U missed to put this datatype outer of
	String sname="";  //U missed to define this u defined wrongly as String sname;  instead of String sname=""; 
	String sname1="";
	int s1, s2, s3;
	Scanner sc = new Scanner(System.in);

	void accept() {

		System.out.println("Enter the Student Id");
		ID = sc.nextInt();
		System.out.println("Enter the Student First Name");
		sname = sc.next();
		System.out.println("Enter the Student Last Name");
		sname1 = sc.next();
		System.out.println("Enter Three Subject Marks: ");
		s1 = sc.nextInt();
		s2 = sc.nextInt();
		s3 = sc.nextInt();
		sc.close();

	}

	void calculate() {
		int total = s1 + s2 + s3;
		int percentage = ((total * 100) / 100);
		System.out.println("Percentage of marks is: " + percentage);
	}

	void display_info() {
		System.out.println("\n............Student profile.........../n");
		System.out.println("Student ID           :  " + ID);
		System.out.println("Student name         :  " +sname+" "+sname1);
		System.out.println("Three Subject Marks     ");
		System.out.println(" Marathi             :  " +s1);
		System.out.println(" English             :  " +s2);
		System.out.println(" Math                :  " +s3);

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student Any = new Student();

		Any.accept();
		Any.calculate();
		Any.display_info();

	}

}
