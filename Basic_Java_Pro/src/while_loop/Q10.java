package while_loop;

import java.util.Scanner;

public class Q10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num, R, frequency = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		num = sc.nextInt();
		System.out.println("Enter input digit");
		R = sc.nextInt();
		while (num != 0)
		{
			if (num % 10 == R) //78977%10=7 R=7 and also R input=& so {True}
			{
				frequency++;
			}
			num = num / 10;    

		}
		System.out.println("Frequency of Digit is :" + frequency);
		
		sc.close();
	}

}
