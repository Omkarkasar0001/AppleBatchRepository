package Trash;

public class test {
	void q1() {
		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

	void q2() {
		for (int i = 1; i <= 5; i++) {
			for (int j = 5; j >= i; j--) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

	void q3() {

		for (int i = 1; i <= 5; i++) {
			for (int j = 5; j >= i; j--) {
				System.out.print("^");
			}
			for (int k = 1; k <= i; k++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

	void q4() {
		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(" ");
			}
			for (int k = 5; k >= i; k--) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

	void q5() {
		int rows = 5;

	}

	void q6() {
		for (int i = 1; i <= 5; i++) {
			for (int j = 5; j >= i; j--) {
				System.out.print("*");
			}
			System.out.println();
		}
		for (int i = 2; i <= 5; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

	void q7() {
		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(" ");
			}
			for (int k = 5; k >= i; k--) {
				System.out.print("*");
			}
			System.out.println();
		}
		for (int i = 2; i <= 5; i++) {
			for (int j = 5; j >= i; j--) {
				System.out.print(" ");
			}
			for (int k = 1; k <= i; k++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

	void q8() { // Copypaste
		int i, j;
		for (i = 1; i <= 5; i++) {
			for (j = 1; j <= 5; j++) {

				if (j == 1 || j == 5)
					System.out.print("*");
				else if (i == 2 && (j == 2 || j == 4))
					System.out.print("*");
				else if (i == 3 && j == 3)
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.println();
		}
	}

	void q9() { // Copypaste
		int rows = 5;
		for (int i = 1; i <= rows; i++) {
			for (int j = 1; j <= i; j++) {
				if (i == 1 || i == rows || j == 1 || j == i) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}

	void q10() {
		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(i);
			}
			System.out.println();
		}
	}

	void q11() {
		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(j);
			}
			System.out.println();
		}
	}
	void q12() {
		for (int i = 5; i >= 1; i--) {
			for (int j = 5; j >= i; j--) {
				System.out.print(i);
			}
			System.out.println();
		}
	}
	
	void q13() {
		for (int i = 5; i >= 1; i--) {
			for (int j = 5; j >= i; j--) {
				System.out.print(j);
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		test s1 = new test();
		s1.q1();
		System.out.println();
		test s2 = new test();
		s2.q2();
		System.out.println();
		test s3 = new test();
		s3.q3();
		System.out.println();
		test s4 = new test();
		s4.q4();
		System.out.println();
		test s5 = new test();
		s5.q5();
		test s6 = new test();
		s6.q6();
		System.out.println("--------------7-----------");
		test s7 = new test();
		s7.q7();
		System.out.println("-------------8--------------");
		test s8 = new test();
		s8.q8();
		System.out.println();
		test s9 = new test();
		s9.q9();
		test s10 = new test();
		s10.q10();
		System.out.println();
		test s11 = new test();
		s11.q11();
		System.out.println();
		test s12 = new test();
		s12.q12();
		System.out.println();
		test s13 = new test();
		s13.q13();

	}

}
