package Star_Pattern;

public class None_15{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int rows = 5;

		// Printing upper half of the pattern

		for (int i = 1; i <= rows; i++) {
			// Printing i spaces at the beginning of each row

			for (int j = 1; j < i; j++) {
				System.out.print(" ");
			}

			// Printing i to rows value at the end of each row

			for (int j = i; j <= rows; j++) {
				System.out.print(j + " ");
			}

			System.out.println();
		}

		// Printing lower half of the pattern

		for (int i = rows - 1; i >= 1; i--) {
			// Printing i spaces at the beginning of each row

			for (int j = 1; j < i; j++) {
				System.out.print(" ");
			}

			// Printing i to rows value at the end of each row

			for (int j = i; j <= rows; j++) {
				System.out.print(j + " ");
			}

			System.out.println();
		}

	}

}
