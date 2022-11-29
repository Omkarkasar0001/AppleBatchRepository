package Trash;

public class num_pattern_Complex {
	public static void p1() {
		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(j);
			}
			for (int k = 5; k > i; k--) {
				System.out.print("^^");
			}
			for(int m=i;m>=1;m--) {   // m=i ;m>=1;m+++
        		System.out.print(m);
			}
			System.out.println();
		}
	}
 public static void p2() {
	  for (int i = 1; i <= 5; i++) {
			for (int j = 5; j >= i; j--) {
				System.out.print(j);
			}
			System.out.println();
	  }
  }
 public static void  p3() {
	 for(int i=1;i<=5;i++) {      //     i=1  i=2        i=3
		 for(int j=i;j>=1;j--)    //    j=1  j=2 j=1   j=3 j=2
		 {
			 System.out.print(j);
		 }
		 System.out.println();
	 }
 }
 public static void p4() {
	 for(int i=1;i<=5;i++) {      //     i=1  i=2        i=3
		 for(int j=5;j>=i;j--)    //    j=1  j=2 j=1   j=3 j=2
		 {
			 System.out.print(" ");
		 }
		 for(int k=i;k>=1;k--) {
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
	}
}