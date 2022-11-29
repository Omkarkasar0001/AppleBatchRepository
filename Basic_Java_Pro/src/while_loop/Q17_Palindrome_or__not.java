package while_loop;

public class Q17_Palindrome_or__not {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		int n = 3773, temp, r, sum = 0;
		temp = n;
		while (n > 0) 
		{
			r = n % 10;
			sum = (sum * 10) + r;
			n = n / 10;
		}
		if (temp == sum)
			System.out.println("Palindrome");
		else
			System.out.println("Not Palindrome");

	}
}
