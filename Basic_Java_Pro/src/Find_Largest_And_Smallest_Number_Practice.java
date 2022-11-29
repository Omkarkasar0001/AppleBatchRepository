
public class Find_Largest_And_Smallest_Number_Practice {

	public static void main(String[] args) {
		{
			double n1 = 7.5, n2 = 6.5, n3 = 1.5, n4 = 5.5;
			if (n1 >= n2 && n1 >= n3 && n1 >= n4) {
				System.out.println("n1 is largest");
			}
			if (n1 <= n2 && n1 <= n3 && n1 <= n4) {
				System.out.println("n1 is small");
			}
			if (n2 >= n1 && n2 >= n3 && n2 >= n4) {
				System.out.println("n2 is largest");
			}
			if (n2 <= n1 && n2 <= n3 && n2 <= n4) {
				System.out.println("n2 is Smallest");
			}
			if (n3 >= n1 && n3 >= n2 && n3 >= n4) {
				System.out.println("n3 is Largest");
			}
			if (n3 <= n1 && n3 <= n2 && n3 <= n1) {
				System.out.println("n3 is Smallest");
			}
			if (n4 >= n1 && n4 >= n2 && n4 >= n3) {
				System.out.println("n4 is Largest");
			}
			if (n4 <= n1 && n4 <= n2 && n4 <= n3) {
				System.out.println("n4 is Smallest");
			}
		}

	}

}
