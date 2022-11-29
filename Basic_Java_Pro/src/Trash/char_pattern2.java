package Trash;

public class char_pattern2 {

	public static void pattern1() {
		// TODO Auto-generated method stub
		for (int i = 1, p = 'A'; i <= 5; i++, p++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(" ");
			}
			for (int k = 5; k >= i; k--) {
				System.out.print((char) p + "");
			}
			System.out.println();
		}
		System.out.println();
	}

	public static void pattern() {
		// TODO Auto-generated method stub
		for (int i = 1, p = 'A'; i <= 5; i++, p++) {
			for (int j = 5; j >= i; j--) {
				System.out.print(" ");
			}
			for (int k = 1; k <= i; k++) {
				System.out.print((char) p + "");
			}
			System.out.println();
		}
	}
	public static void pattern2() {
		
		
	}
	public static void main(String[] args) {
		pattern1();
		pattern();
	}

}
//^AAAAA
//^^AAAA
//^^^AAA
//^^^^AA
//^^^^^A

//^^^^^A
//^^^^AA
//^^^AAA
//^^AAAA
//^AAAAA