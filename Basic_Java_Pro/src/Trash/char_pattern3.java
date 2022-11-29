package Trash;

public class char_pattern3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int i = 1, p = 'E'; i <= 5; i++, p--) {
			for (int j = 1; j <= i; j++) {
				System.out.print(" ");
			}
			for(int k=5;k>=i;k--)
			{
				System.out.print((char) p);
			}
			System.out.println();
		}
		// EEEEE
		 // DDDD
		  // CCC
		  //  BB
		    // A


	}
}
//EEEEE
// EEEE
//  EEE
//   EE
//	  E
