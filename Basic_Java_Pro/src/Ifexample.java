import java.util.Scanner;

public class Ifexample {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter Your Marks");
		int m=sc.nextInt();
	    if(m>=40)
	    	System.out.println("Your Passed...");
	    else
	    	System.out.println("Try again...");
		
	}

}
