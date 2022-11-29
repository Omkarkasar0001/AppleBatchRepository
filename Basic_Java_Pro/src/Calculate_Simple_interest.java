
public class Calculate_Simple_interest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float a, r, t, T, Si;
		a = 800000;
		r = 12; 												// 12% per annum
		t = 1;													 // 1 Year Duration
		Si = (a * r * t) / 100; 								// Simple Interest
		T = a + Si; 											// Total amount
		System.out.println("Principal Amount	      :" + a);
		System.out.println("Simple Intrest (for 1 Year)   :" + Si);
		System.out.println("Total Amount to pay           :" + T);
		
		

	}

}
