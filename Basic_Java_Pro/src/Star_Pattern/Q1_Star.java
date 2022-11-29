package Star_Pattern;

public class Q1_Star {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int myrows = 5;
		System.out.println("\nThe star pattern is... ");
		for (int m = 1; m <= myrows; m++) {
			for (int n = 1; n < m; n++) {
				System.out.print(" ");
			}
			for (int p = myrows; p >= m; p--) {
				System.out.print("*");
			}
			System.out.println();

		}
	}
}
