package Constructor;

import java.util.Scanner;

public class PvrMovie {
	int id, releaseyear, budget;  //global variable
	String name, producer;        //global variable

	PvrMovie(int id, String name, int releaseyear, String producer, int budget) {   //Local variables
		this.id = id;                                          //this is used define which is global which is local variables
		this.name = name;
		this.releaseyear = releaseyear;
		this.producer = producer;
		this.budget = budget;

	}

	void display() {
		System.out.println(id + " " + name + " " + releaseyear + " " + producer + " " + budget + "  crore");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		for(int i =1 ; i<=3 ;i++)  //For Loop
		{
			
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the id :");
		int id = sc.nextInt();
		System.out.println("Enter the movie name:");
		String name = sc.next();
		System.out.println("Enter the movies release year:");
		int releaseyear = sc.nextInt();
		System.out.println("Enter the producer name:");
		String producer = sc.next();
		System.out.println("Enter the budget:");
		int budget = sc.nextInt();
		
		//Method calling
		PvrMovie m = new PvrMovie(id,name,releaseyear,producer,budget);
		m.display();

		}
	}
}