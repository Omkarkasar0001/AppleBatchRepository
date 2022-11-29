package Star_Pattern;

public class Pattern_nu_Seresifor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 100;
		int i = 1, j = 1, k = 4;
		for (; i <= n; i++) {
			System.out.print(i + " ");
			i = (k * j) + i;
			j++;
		}
         System.out.println();
		{
			System.out.print("Enter the range greater then 0 ");
		}
	}

}
