import java.util.Scanner;

public class Hotel_Menu_Assignment {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println(
				"\n1 Maharashtrian Thali 250/- \n2 Punjabi Thali 300/- \n3 Rajasthani Thali 400/-  \n4 South Indian Thali 200/- ");

		System.out.println("\n Choice Your Fevorite Dish :");
		int num, n1 = 250, n2 = 300, n3 = 400, n4 = 200, p1, p2, p3, p4, quantity;
		num = sc.nextInt();
		System.out.println("Enter quantity of Dish");
		quantity = sc.nextInt();
		/*
		 * p1 = (n1 * quantity); p2 = (n2 * quantity); p3 = (n3 * quantity); p4 = (n4 *
		 * quantity);
		 */
		switch (num) {
		case 1:
			p1 = (n1 * quantity);
			System.out.println("Total Amount is: " + (n1 * quantity) + "\n\nTotol Amount With 18% GST :" + (p1 * 1.18)
					+ "\n\n....Omkar Food Court...." + "\nThank You Visit Again....");
			break;
		case 2:
			p1 = (n2 * quantity);
			System.out.println("Total Amount is: " + (n2 * quantity) + "\n\nTotol Amount With 18% GST :" + (p1 * 1.18)
					+ "\n\n....Omkar Food Court...." + "\nThank You Visit Again....");
			break;
		case 3:
			p1 = (n3 * quantity);
			System.out.println("Total Amount is: " + (n3 * quantity) + "\n\nTotol Amount With 18% GST :" + (p1 * 1.18)
					+ "\n\n....Omkar Food Court...." + "\nThank You Visit Again....");
			break;
		case 4:
			p1 = (n4 * quantity);
			System.out.println("Total Amount is: " + (n4 * quantity) + "\n\nTotol Amount With 18% GST :" + (p1 * 1.18)
					+ "\n\n....Omkar Food Court...." + "/nThank You Visit Again....");
			break;

		default:
			System.out.println("Invalid Input :");
			// sc.close()
		}
	}

}
