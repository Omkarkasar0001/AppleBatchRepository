import java.util.Scanner;

public class Switch_Statement___ {

	public static void main(String[] args) {
		String sname; //
		Scanner sc = new Scanner(System.in); //
		System.out.println("Enter a state name ");
		sname = sc.nextLine(); //
		sname = sname.toLowerCase();
		switch (sname) // Start with Small
		{
		case "maharashtra":
			System.out.println("Capital is Mumbai");
			break;
		case "goa":
			System.out.println("Capital is Panji");
			break;
		case "gujarat":
			System.out.println("Capital is Gandhi Nagar");
			break;
		case "uttar Pradesh":
			System.out.println("Capital is Lucknow");
			break;
		case "jharkhand":
			System.out.println("Capital is Rachi");
			break;
		case "karnataka":
			System.out.println("Capital is Banglore");
			break;
		default:
			System.out.println("Invalid Input");
		}

	}

}
