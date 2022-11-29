package First_Written_Test;

import java.util.Scanner;

public class Year_Week_Days_Conversion {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Days:  ");
		float Days = sc.nextFloat();
		float Weeks, Years,Months;
		Years = Days / 365; // A Year has 365 days
		Weeks = Years * 52; // A Year has 52 Weeks
		
		System.out.println("Total Days         :   " + Days);
		System.out.println("Total Weeks in Year:   " + Weeks);
		System.out.println("Total Years        :   " + Years);
		
	}

}
