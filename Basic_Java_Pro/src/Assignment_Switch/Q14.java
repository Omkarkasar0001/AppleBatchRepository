package Assignment_Switch;

import java.util.Scanner;

public class Q14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Choise");
		int i = sc.nextInt();
		System.out.println("Enter J Value");
		int j = sc.nextInt();

		switch (i) {
		case 2:
			j += 6; // j=j+6
			break;
		case 4:
			j += 1;
			break;
		default:
			j += 2;
			break;
		case 0:
			j += 4;
			
		}
		System.out.println("j = " + j);
	}

}
