import java.util.Scanner;

public class Switch_Statement_Fun {

	public static void main(String[] args) {
		String sname; //
		Scanner sc = new Scanner(System.in); //
		System.out.println(" IBM");
		System.out.println("Enter Your Fovorite Company");
		sname = sc.nextLine(); //
	
		switch (sname) // Start with Small

		{
		case "IBM":
		System.out.println("CEO : Arvind Krishna (6 April 2020) Headquarters : Armonk, New York, United States\r\n"
				+ "Founder : Charles Ranlett Flint\r\n"
				+ "Date and place of establishment : 16 June 1911, Endicott, New York, United States\r\n"
				+ "Number of Employees : 2,82,100\r\n"
				+ "Income : 57.35 billion USD (2021)");
		case "Google":
			System.out.println(""
					+ "Formerly	Backrub (1995-1997)\r\n"
					+ "Google Inc. (1997–2017)CEO-Sunder Pichai");
		default:System.out.println("Invalid input");
		}
	}

}
