package while_loop;

public class Nope_Q8_Q9_addition_of_Numbers_Sum_of_Even_Odd_Numbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = 0, limit = 5, sum = 0, sumod = 0,product = 1;
		while (i <= limit) // i value is 1
		{
			if (i % 2 == 0)
			{
				sum = sum + i;
			}
			else 
			{

				sumod = sumod + i;
			}
			i++;
		}
		System.out.println("Addition of even number is: " + sum);
		System.out.println("Addition of odd number is: " + sumod);
	{i=1;
	while(i<=limit)
	{
	   product=product*i;
	   i++;
   }
	System.out.println("Product: "+product);
}
	}
}
