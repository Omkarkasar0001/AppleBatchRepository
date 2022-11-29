import java.util.Scanner;

public class Switch_Statement________ {

	public static void main(String[] args) {
		int a,b;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Two Number: ");
		a=sc.nextInt();
		b=sc.nextInt();
		System.out.println("\n1 Addition \n2 Substration \n3 Multiplication \n4 Divition");
		System.out.println(" Enter Your Choice: ");
		int ch=sc.nextInt();
		
		switch (ch)
		{
		case 1:
			System.out.println("Enter Two Number For Addition :");
			System.out.println("Addition is:"+(a+b));
		case 2:
			System.out.println("Enter Two Number For Substration :");
			System.out.println("Substration is:"+(a-b));
		case 3:
			System.out.println("Enter Two Number For Multiplication :");
			System.out.println("Substration is:"+(a*b));
		case 4:
			System.out.println("Enter Two Number For Divition :");
			System.out.println("Divition is:"+(a/b));
		
		}

	}

}
