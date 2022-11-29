package self_Practice;

public class Pyramid_star_apttern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int input =5;
		for (int i = 1; i <=input ; i++) {        //i=1   
			for (int j = i; j <= input ; j++) {   //j=1    j=2    j=3     j=4     j=

				System.out.print("^");
			}
			                                       //                      j---->
			                                       //				                    
			                                       //                 i
			                                       //                 |  1   ^  ^  ^  ^   ^  *
			for (int k = 1; k < (i * 2); k++) {    //                 |  2   ^  ^
				                                   //                 v  3
				System.out.print("*");             //                    4 
			}                                      //                    5

			System.out.println();
		}
	}
}