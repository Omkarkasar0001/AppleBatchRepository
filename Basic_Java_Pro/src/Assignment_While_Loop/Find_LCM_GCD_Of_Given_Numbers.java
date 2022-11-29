package Assignment_While_Loop;

public class Find_LCM_GCD_Of_Given_Numbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n1 = 30, n2 = 90, lcm;
		lcm = (n1 > n2) ? n1 : n2;  // maximum number between n1 and n2 is stored in lcm	
		while (true) // Always true
		{
			if (lcm % n1 == 0 && lcm % n2 == 0) 
			{
				System.out.println("The LCM  is " + lcm);
				break;
			}
			++lcm;
		}                          // Now Find GCD
		
		while (n1 != n2) 
		{												 // n1 is not equal to n2
			if (n1 > n2) 
			{
				n1 -= n2; // n1=98-56 n1=42-56=14

			} 
			else
				n2 -= n1;
		}

		System.out.println("GCD is " + n1);

	}
}