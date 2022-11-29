package pattern_revision;

public class pattern_revision {
	public static void p1() {
		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(j);
			}
			System.out.println();
		}
	}

	public static void p2() {
		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j < 2 * i; j++) {
				System.out.print(j);
			}
			System.out.println();
		}
	}

	public static void p3() { // ch=i, a=1,e=5,j=j
		for (char ch = 'a'; ch <= 'e'; ch++) {
			for (char j = 'a'; j <= ch; j++) {
				System.out.print(ch);
			}
			System.out.println();
		}
	}

	public static void p4() {
		char ch = 'A';
		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(ch + " ");
			}
			System.out.println();
		}
	}

	public static void p5() {
		char ch = 'A';
		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(ch + " ");
			}
			System.out.println();
			ch++;

		}
	}

	public static void p6() {
		char ch = 'A';
		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(ch + " ");
			}
			System.out.println();
			ch++;
			ch++;

		}
	}

	public static void p7() {
		for (char ch = 'a'; ch <= 'e'; ch++) {
			for (char j = 'a'; j <= ch; j++) {
				System.out.print(j);
			}
			System.out.println();
		}
	}

	public static void p8() {
		for (char ch = 'A'; ch <= 'E'; ch++) {
			for (char j = 'A'; j <= ch; j++) {
				System.out.print(j);
			}
			System.out.println();
		}
	}

	public static void p9() {
		for (int i = 5; i >= 1; i--) {
			char c = 'A';
			for (int j = 1; j <= i; j++) {
				System.out.print(c + " ");
			}
			System.out.println();
			c++;
		}
	}

	public static void p10() {
		for (int i = 1; i <= 5; i++) {
			int x = 96;
			for (int j = 1; j <= i; j++) {
				System.out.print((char) (j + x) + " ");
			}
			System.out.println();
			x++;
		}
	}
  
	public static void p11() {
		for (int i = 1; i <=5; i++) {
			char ch='A';
			for (int j = 1; j <= i; j++) {
				System.out.print(ch + " ");
				ch++;
				ch++;
			}
			System.out.println();
			
		}
	}
	public static void p12() {
		
		for (int i = 1; i <=5; i++) {
			char ch='A';
			for (int j = 1; j <= i; j++) {
				System.out.print(ch);
				ch++;
			}
			ch--;
			for(int k=i-1;k>=1;k--) 
			{
				ch--;
				System.out.print(ch);
				
			}
			System.out.println();
			
		}
	}
	public static void p13() {
		int n=1;     ///                          important
		 for (int i = 1; i <= 5; i++) {
		      for (int j = 1; j <= i; j++) {
		          System.out.print(n+++" ");
		        }
		        System.out.println();
		 }
	}
	public static void p14() {
		int n=1;     ///                          important
		 for (int i = 1; i <= 3; i++) {
		      for (int j = 3; j >= i; j--) {
		          System.out.print(" ");
		        }
		      for(int k=1;k<=i;k++) {
		    	  System.out.print(n+++"");
		      }
		        System.out.println();
		 }
	}
	public static void p15() {
		int n=1;     ///                          important
		 for (int i = 1; i <= 3; i++) {
		      for (int j = 1; j <= i; j++) {
		          System.out.print(" ");
		        }
		      for(int k=5;k>=i;k--) {
		    	  System.out.print(k);
		      }
		        System.out.println();
		 }
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		p1();
		System.out.println();
		p2();
		System.out.println();
		p3();
		System.out.println();
		p4();
		System.out.println();
		p5();
		System.out.println();
		p6();
		System.out.println();
		p7();
		System.out.println();
		p8();
		System.out.println();
		p9();
		System.out.println();
		p10();
		System.out.println();
		p11();
		System.out.println();
		p12();
		System.out.println();
		p13();
		System.out.println();
		p14();
		System.out.println();
		p15();

	}

}
