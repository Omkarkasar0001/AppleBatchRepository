package Trash;

import java.util.Scanner;

import methods.Employee;

public class Q2 {

	int id;
	String name, dept;
	float salary;
	double contact;
	String email;

	void Set(int idd, String namee, String deptt, float salaryy, double contactt, String emaill) {
		id = idd;
		name = namee;
		dept = deptt;
		salary = salaryy;
		contact = contactt;
		email = emaill;
	}

	void display() {
		System.out.println(id + " " + name + " " + dept + " " + salary + " " + contact + " " + email);

	}

	public static void main(String[] args) {
		Employee s = new Employee();
		Employee s2 = s;
		

		Scanner sc = new Scanner(System.in);
		System.out.println("enter the id");
		int i = sc.nextInt();
		System.out.println("enter the name");
		String n = sc.next();
		System.out.println("enter the departnment name ");
		String d = sc.next();
		System.out.println("enter the salary");
		float sa = sc.nextFloat();
		System.out.println("enter the contact number ");
		double c = sc.nextDouble();
		System.out.println("enter the email");
		String e = sc.next();
		s.Set(i, n, d, sa, c, e);

		
		
		System.out.println("enter the id");
		i = sc.nextInt();
		System.out.println("enter the name");
		n = sc.next();
		System.out.println("enter the departnment name ");
		d = sc.next();
		System.out.println("enter the salary");
		sa = sc.nextFloat();
		System.out.println("enter the contact number ");
		c = sc.nextDouble();
		System.out.println("enter the email");
		e = sc.next();
		s2.Set(i, n, d, sa, c, e);

		
		

		s.display();
		s2.display();
		
	}

}
