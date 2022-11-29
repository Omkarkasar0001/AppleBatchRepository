package Assignment1;

public class Simple_interest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
		float P, R, T,Total, Si;
		P = 800000;												//Initial Amount
		R = 12; 												// 12% per annum
		T = 1;													 // 1 Year Duration
		Si = (P*R*T)/100;								// Simple Interest
		Total = P + Si; 											// Total amount
		System.out.println("Principal Amount	      :" + P);
		System.out.println("Simple Intrest (for 1 Year)   :" + Si);
		System.out.println("Total Amount to pay           :" +Total);
	}

}
