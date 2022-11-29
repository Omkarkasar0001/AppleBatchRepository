package methods;

import java.util.Scanner;

public class Student_list2 {
	int id, marks; // This are Global Variable because its Under loop of Class
	String name, dept;

	void acceptDetails(int i, int m, String n, String d) {
		id=i;  //Always write like this bcz java read left to right computer side  (not like i=id))
		marks=m;
		name=n;
		dept=d;

	}

	void display() {
		
		System.out.println(id + " " + name + " " + marks + " " + dept);
	}
	

	public static void main(String[] args) {
		// USe global Variable for every objects
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Student ID:  "); // Lets Initialize Global Variables
		int sid = sc.nextInt();
		System.out.println("Enter Student Name:  ");
		String sname = sc.next();
		System.out.println("Enter Student Marks:  ");
		int smarks = sc.nextInt();
		System.out.println("Enter Student Department:  ");
		String sdept = sc.next();
		
		Student_list2 any1 = new Student_list2();
		any1.acceptDetails(sid,smarks,sname, sdept);
		
		
		
		any1.display();
	
	}

}
