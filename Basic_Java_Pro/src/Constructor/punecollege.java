 package Constructor;

import java.util.Scanner;

public class punecollege {

	int id;
	String name;
	static String uniname = "Pune_University";
	
	
    punecollege(int idd, String namee) {
		// TODO Auto-generated constructor stub
		id = idd;
		name = namee;
	}
	punecollege() {
		// TODO Auto-generated constructor stub
		id = 101;
		name = "Omkar";
	}




	

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Your ID");
		int i=sc.nextInt();
		System.out.println("Enter Your Name");
		String n=sc.next();
  
		 
		// Object Creation
		punecollege s1 = new punecollege(i,n);
		punecollege s2 = new punecollege(102,"Raj  ");
		

		System.out.println(s1.id + " " + s1.name + " " + uniname);
		System.out.println(s2.id + " " + s2.name+ " " + uniname);
	}

}
