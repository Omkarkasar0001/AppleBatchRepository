import java.util.Scanner;

public class Area_of_Circle {

	public static void main(String[] args) {
		double radius, area, circumference;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Radius of Circle:");
		radius = sc.nextDouble();
		// Calculate area and circumference of circle
		area = Math.PI * radius * radius;
		circumference = 2 * Math.PI * radius;
		System.out.println("Diameter Of Circle      : " + (radius * 2));
		System.out.println("Area of Circle          : " + area);
		System.out.println("Circumference of Circle : " + circumference);
		
		}

}
