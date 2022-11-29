package self_Practice;

public class Inverse_star_pattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i, j, row = 5;
		for (i = 1; i <= row; i++) {
			for (j = 4; j >= i; j--) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
