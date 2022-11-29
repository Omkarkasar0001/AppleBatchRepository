package Assignment_Switch;

public class Q8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Java Program to implement String on switch statements in Java

		// create a string
		String language = "Java";

		switch (language) {

		case "Java":
			System.out.println(language + " is famous for enterprise applications.");
			break;

		case "JavaScript":
			System.out.println(language + " is famous for frontend and backend.");
			break;

		case "Python":
			System.out.println(language + " is famous for ML and AI.");
			break;

		default:
			System.out.println(language + " not found on record.");
			break;
		}
	}
}
