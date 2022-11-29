package Constructor;

import java.util.Scanner;

public class inox {
	int id,releaseyear;
	String name;
	
	inox(int id,int releaseyear,String name){ //Constructor
		this.id=id;
		this.releaseyear=releaseyear;
		this.name=name;
	}

	void display() {
		System.out.println(id+" "+releaseyear+" "+name);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		for(int i=1;i<=3;i++) {
			System.out.println("Enter id :");
			int id=sc.nextInt();
			System.out.println("Enter Releaseyear :");
			int releaseyear=sc.nextInt();
			System.out.println("Enter the Name:");
			String  name=sc.next();
			inox s=new inox(id, releaseyear, name);
			s.display();
		}

	}

}
