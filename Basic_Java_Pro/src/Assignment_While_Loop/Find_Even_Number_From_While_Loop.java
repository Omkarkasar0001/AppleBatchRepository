package Assignment_While_Loop;

public class Find_Even_Number_From_While_Loop {

	public static void main(String[] args) {
		int i = 121, b = 229;   //i is start point and b is end point

		System.out.println("Even number are: ");

		while (i <= b) 
		{
			if (i % 2 == 0)      //odd number check condition
			{                 
				System.out.println(i + "");

			}
			i++;
		}

		System.out.println("Done");
	}

}
