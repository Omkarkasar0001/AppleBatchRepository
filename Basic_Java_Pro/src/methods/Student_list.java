package methods;

import java.util.Scanner;

public class Student_list {
	int id, marks; // This are Global Variable because its Under loop of Class
	String name, dept;

	void acceptDetails() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Student ID:  "); // Lets Initialize Global Variables
		id = sc.nextInt();
		System.out.println("Enter Student Name:  ");
		name = sc.next();
		System.out.println("Enter Student Marks:  ");
		marks = sc.nextInt();
		System.out.println("Enter Student Department:  ");
		dept = sc.next();
		 //Never Add Scaner close here
		
	}

	void Display() {
		System.out.println(id + " " + name + " " + marks + " " + dept);
	}
 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student_list any1 = new Student_list(); // Lets Call acceptDetils for 3 times
		any1.acceptDetails();
		Student_list any2 = new Student_list();
		any2.acceptDetails();
		Student_list any3 = new Student_list();
		any3.acceptDetails();

		any1.Display(); // Lets call Display of each AcceptDetails
		any2.Display();
		any3.Display();
		
	}

}
