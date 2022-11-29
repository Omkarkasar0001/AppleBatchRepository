import java.util.Scanner;

public class Switch_Break_Statement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("How Many Participents for Trip:  ");
		int p = sc.nextInt();
		System.out.println("Number of Participents are: " + p);
		switch (p) {
		/*
		 * case 1: case 2: case 3:
		 */
		case 4:
			System.out.println("So..Lets arrange Alto Car");
			break;
		/*
		 * case 5: case 6: case 7:
		 */
		case 8:
			System.out.println("So..Lets arrange Ertiga");
			break;
		case 15:
			System.out.println("So..Lets arrange Traveller");
			break;
		case 20:
			System.out.println("So..Lets arrange Mini Bus");
			break;
		default:
			System.out.println("Invalid Number of Participents.");
			
		}

	}

}
