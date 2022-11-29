package Star_Pattern;

public class pattern_seies_none {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 100;
		int i = 1, j = 1, k = 4;
		if (n > 0) {
			while (i <= n) {
				System.out.print(i + " ");
				i = (k * j) + i;
				j++;
			}
		}
	}
}