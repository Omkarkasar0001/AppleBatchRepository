package Trash;

public class char_pattern4 {
	void p1() {
		for (int i = 1, p = 'E'; i <= 5; i++, p--) {
			for (int j = 1; j <= i; j++) {
				System.out.print(" ");
			}
			for (int k = 5; k >= i; k--) {
				System.out.print((char) p + " ");
			}
			System.out.println();
		}
	}

	void p2() {
		for (int i = 1, p = 'E'; i <= 5; i++, p--) {
			for (int j = 5; j >= i; j--) {
				System.out.print(" ");
			}
			for (int k = 1; k <= i; k++) {
				System.out.print((char) p + " ");
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      char_pattern4 any=new char_pattern4();
      any.p1();
      System.out.println();
      any.p2();
	}

}
// E E E E E 
//  D D D D 
//   C C C 
//    B B 
//     A 
