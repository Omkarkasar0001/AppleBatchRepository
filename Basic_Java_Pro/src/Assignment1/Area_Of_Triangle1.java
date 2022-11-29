package Assignment1;
import java.util.Scanner;

public class Area_Of_Triangle1 {

	public static void main(String[] args) {
		float b , h, a;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter base");
		b = sc.nextFloat();
		System.out.println("Enter height");
		h = sc.nextFloat();
		a = (float) (0.5 * b * h);
		System.out.println("Area of Triangle   " + a);

	}

}
