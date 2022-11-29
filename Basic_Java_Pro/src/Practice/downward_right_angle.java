package Practice;

import java.util.Scanner;

public class downward_right_angle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 4;
		/*
		 * for (int i = 1; i <= num; i++) // Start;True;ibncremenet { for (int j = 1; j
		 * <= i; j++) { System.out.print("*"); } System.out.println(); }
		 */
		System.out.println("Downward");
		for (int i = num; i >= 1; i--)    //i=4
		{
			for (int j = 1; j <= i; j++)
				;
			{
				System.out.print("*");
			}
			System.out.println("");
		}
	}
}
