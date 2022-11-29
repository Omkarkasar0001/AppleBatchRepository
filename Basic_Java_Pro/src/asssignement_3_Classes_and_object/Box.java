package asssignement_3_Classes_and_object;

import java.util.Scanner;

public class Box {

	void volume(int L, int H, int W) {

		int V = (L * H * W);
		System.out.println("Volume of Box: " + V);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Length");
		int L = sc.nextInt();
		System.out.println("Enter Height");
		int H = sc.nextInt();
		System.out.println("Enter Width");
		int W = sc.nextInt();
		// Method Calling
		Box Vol = new Box(); // Class anyname=new Class();
		Vol.volume(L, H, W); // anyname.methodname(parameter witout datatype);
		sc.close();

	}
}
