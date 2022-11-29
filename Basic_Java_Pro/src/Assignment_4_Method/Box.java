package Assignment_4_Method;

import java.util.Scanner;

public class Box {
	int lenght, widgth, height;

	int calculate(int lenght, int widgth, int height) {
		int volume = lenght * height * widgth;
		return volume; // To send value of volume to display method
	}

	void display(int volume) {
		System.out.println("Volume of Box:" + volume);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Lenght: ");
		int L = sc.nextInt();
		System.out.println("Enter the Widgth: ");
		int W = sc.nextInt();
		System.out.println("Enter the Height: ");
		int H = sc.nextInt();
		
		Box s = new Box();                  //Classname any=new Classname();
		int volume = s.calculate(L, W, H);  //int volume=any.calculate(L,W,H);
		s.display(volume);                  //any.display(volume);

	}
}
