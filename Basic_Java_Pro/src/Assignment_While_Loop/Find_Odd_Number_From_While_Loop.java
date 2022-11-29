package Assignment_While_Loop;

public class Find_Odd_Number_From_While_Loop {

	public static void main(String[] args) {

		int i = 229, limit = 521;

		System.out.println("Odd number are: ");

		while (i <= limit) {
			if (i % 2!= 0) 
			{
				System.out.println(i + "");

			}
			i++;
		}

		System.out.println("Done");

	}
}
