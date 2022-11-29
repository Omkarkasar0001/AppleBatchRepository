package while_loop;

public class Q20 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			int n, b, rev = 0;
			int N=500;
			System.out.print("Palindrome numbers from 100 to 500:  ");
			for (int i = 100; i <= N; i++)
			{
				n = i;
				while (n > 0)
				{
					b = n % 10;
					rev = rev * 10 + b;
					n = n / 10;
				}
				if (rev == i)
				{
					System.out.print(i + " ");
				}
				rev = 0;
			}
		}
	 
	}
