package methods;

import java.util.Scanner;

public class Shopping {
	String item_name;
	int quantity;
	float price, total_bill;

	void acceptDetails(String name, int p, int quant) {
		item_name = name;
		price = p;
		quantity = quant;

	}

	void calculate() {

		total_bill = price * quantity;

	}

	void show() {
		if (quantity > 0) {
			System.out.println("\n********************Your Shopping Details**************");
			System.out.println("item Name" + item_name);
			System.out.println("Price " + price);
			System.out.println("Quantity " + quantity);
			System.out.println("Total Bill: " + total_bill);
		} else {
			System.out.println("Pls Enter Correct Quantity");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String n;
		int p, q;
		System.out.println("Enter item name");
		n = sc.nextLine();
		System.out.println("Enter price");
		p = sc.nextInt();
		System.out.println("Enter Quantity");
		q = sc.nextInt();

		// method calling
		Shopping s = new Shopping();
		s.acceptDetails(n, p, q);
		s.calculate();
		s.show();

	}

}
