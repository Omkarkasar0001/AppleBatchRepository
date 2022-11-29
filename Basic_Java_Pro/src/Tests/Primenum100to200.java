package Tests;

public class Primenum100to200 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int i = 100; i <= 200; i++) {
			for (int j = 2; j <= i; j++) {
				if (i % j == 0) {
					break;
			}
			
			if (i == j)
				System.out.println(j);
		}
	}

	}
}
