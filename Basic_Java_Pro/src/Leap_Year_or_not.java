import java.util.Scanner;

public class Leap_Year_or_not {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int year=2023;
		if((year%400==0) ||(year%4==0 && year %100!=0))
		{
			System.out.println("leap year");
		}
		else
			System.out.println("not leap");
	}
}