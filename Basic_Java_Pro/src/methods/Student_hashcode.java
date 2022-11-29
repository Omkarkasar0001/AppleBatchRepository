package methods;

import java.util.Scanner;

public class Student_hashcode {
	
int id;
String name;
String dept;
int marks;

	void data(int idd,String namee,String deptt,int markss) {
		 id=idd;
		 name=namee;
		 dept=deptt;
		 marks=markss;
	}
	void display() {
		System.out.println("Enter Id:"+id+"ENter name"+name+"Enter Department"+dept+"Eneter Marks"+marks);
	}
	public static
		 
		
		

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter ID");
		id=sc.nextInt();
	}

}
