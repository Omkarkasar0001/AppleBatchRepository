package Star_Pattern;

public class Q14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int row = 5;
		System.out.println("\nThe star pattern is... ");
		for (int i = 1; i <= row; i++) {
			for (int j = row; j > i; j--) {
				System.out.print(" ");
			}
			for (int k = 1; k <= (i * 2) - 1; k++) {
				System.out.print("*");
			}
			System.out.println();
		}
		for (int i = row - 1; i >= 1; i--) {
			for (int j = row - 1; j >= i; j--) {
				System.out.print(" ");
			}
			for (int k = 1; k <= (i * 2) - 1; k++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
