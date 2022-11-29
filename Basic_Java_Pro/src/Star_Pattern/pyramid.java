package Star_Pattern;

public class pyramid {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sp = 5;
		for (int i = 5; i >= 1; i--) {
			for (int j = 5; j <= sp; j++) {  //i=1   j1  k1  k2  k3  k4  k5
				System.out.print("^");       //1=2   j1 j2  k1  k2  k3  k4
			}                                //i=3   j1 j2 j3  k1  k2  k3
			                                 //i=4   j1 j2 j3 j4  k1  k2
			for (int k = 1; k <= i; k++) {   //i=5   j1 j2 j3 j4 j5 k1
				System.out.print("* ");  //Don't forgot space after *
			}
			sp++;
			System.out.println();
		}
		
	}

}
