package all_over_practice;
//Overlaoding using constructor
import java.util.Scanner;

public class overlaoding {
	int id;
	overlaoding(int id){
		this.id=id;
	}
	void display() {
		System.out.println(" "+id);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter id");
		int i=sc.nextInt();
		overlaoding a1=new overlaoding(i);
		a1.display();

		

	}

}
