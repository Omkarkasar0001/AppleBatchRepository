package Assignment1;

public class Calculate_Compound_Interest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float P, R, T,Total, Ci;
		P = 800000;												//Initial Amount
		R = 12; 												// 12% per annum
		T = 1;													 // 1 Year Duration
		Ci = (float) (P * (Math.pow((1 + R / 100), T)) - P);	// Compound Interest
		Total = P + Ci; 											// Total amount
		System.out.println("Principal Amount	      :" + P);
		System.out.println("Compound Intrest (for 1 Year) :" + Ci);
		System.out.println("Total Amount to pay           :" +Total);
		
	}

}
