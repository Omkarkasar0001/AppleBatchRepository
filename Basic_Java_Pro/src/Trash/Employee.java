package Trash;

import java.util.Scanner;

public class Employee {
  int id;
  String name,dept,email;
  float salary;
  double contact;
   
  void Set(int idd,String namee,String deptt,String emaill,float salaryy,double contactt) {
	  id=idd;
	  name=namee;
	  dept=deptt;
	  email=emaill;
	  salary=salaryy;
	  contact=contactt;  
  }
  void display() {
	  System.out.println(id+" "+name+" "+dept+" "+email+" "+salary+" "+contact);
  }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		Employee s=new Employee();
		System.out.println("Enter the ID");
		  int i = sc.nextInt();
		System.out.println("Enter the Name");
		  String n = sc.next();
		System.out.println("Enter the Deptt");
		  String d = sc.next();
		System.out.println("Enter the Email");
		 String e = sc.next();
		System.out.println("Enter the Salary");
		 float sa = sc.nextFloat();
		System.out.println("Enter the Contact");
		 double c = sc.nextDouble();
		s.Set(i, n, d, e, sa, c);
		
		Employee s1=new Employee();
		System.out.println("Enter the ID");
		  i=sc.nextInt();
		System.out.println("Enter the Name");
		  n=sc.next();
		System.out.println("Enter the Deptt");
		  d=sc.next();
		System.out.println("Enter the Email");
		 e=sc.next();
		System.out.println("Enter the Salary");
		 sa=sc.nextFloat();
		System.out.println("Enter the Contact");
		 c=sc.nextDouble();
		s1.Set(i, n, d, e, sa, c);
		
		Employee s2=new Employee();
		System.out.println("Enter the ID");
		  i=sc.nextInt();
		System.out.println("Enter the Name");
		  n=sc.next();
		System.out.println("Enter the Deptt");
		  d=sc.next();
		System.out.println("Enter the Email");
		 e=sc.next();
		System.out.println("Enter the Salary");
		 sa=sc.nextFloat();
		System.out.println("Enter the Contact");
		 c=sc.nextDouble();
		s2.Set(i, n, d, e, sa, c);

		
		s.display();
		s1.display();
		s2.display();
	}

}
