package Constructor;

import java.util.Scanner;

public class Employee {   // toString method
	int id;
	String name;
	
  void setData(int i,String n) {
	  id=i;
	  name=n;
	}
	
	
	public String toString() {
		return "Enter ID: "+id+"   Enter Your Name : "+name;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);    //Scanner
		System.out.println("Enter Your Id");  //
		int id=sc.nextInt();
		System.out.println("Enter Your Name");
		String name=sc.next();
		Employee s1=new Employee();          //Classname any=new Classname();
	
		s1.setData(id, name);                  //any.setData(id,name);
		System.out.println(s1);                //Sop(s1);
		
		

	}

}
