package Trash;

public class pattern_practice {
	void p1() {
		for(int i=1;i<=5;i++){  
			for(int j=5;j>=i;j--) {
				System.out.print(j);
			}
			System.out.println();
		}

	}
	void p2() {
		for(int i=1;i<=5;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print(j);
			}
			System.out.println();
			}
			
		}
	void p3() {
		for(int i=1;i<=5;i++ ) {
			for(int j=1;j<=i;j++) {
				System.out.print(i);
			}
			System.out.println();
		}
	}
	void p4() {
		for(int i=1;i<=5;i++) {
			for(int j=5;j>=i;j--) {
				System.out.print(j);
			}
			System.out.println();
		}
	}
	void p5() {
		for(int i=1;i<=5;i++){   //          i=1
			for(int j=5;j>=i;j--) {   //j=1
				System.out.print(i);
			}
			System.out.println();
		}
	}
	
	void p6() {
		for(int i=1;i<=5;i++){   //          i=1
			for(int j=1;j<=i;j++) {   //j=1
				System.out.print(j%2+" "); ṁ
			}
			System.out.println();
		}
	}
	
	void p7() {
		for(int i=1;i<=5;i++){   //          i=1
			for(int j=1;j<=i;j++) {   //j=1
				System.out.print(i%2+" ");
			}
			System.out.println();
		}
	}
	void p8() {
		for(int i=1;i<=5;i++){   //          i=1
			for(int j=1;j<=i;j++) {   //j=1
				System.out.print(j+" ");
				i++;
			}
			System.out.println();
		}
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		pattern_practice s=new pattern_practice();
		s.p2();
		System.out.println();
		s.p3();
		System.out.println();
		s.p4();
		System.out.println();
		s.p5();
		System.out.println();
		s.p6();
		System.out.println();
		s.p7();
		System.out.println();
		s.p8();
		/*
		 * System.out.println(); s.p9(); System.out.println(); s.p10();
		 */
		}

	
}
