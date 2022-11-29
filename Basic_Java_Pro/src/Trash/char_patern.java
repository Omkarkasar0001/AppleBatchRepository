package Trash;

public class char_patern {
	void p1() {
	    for(int i=1,p='A';i<=5;i++,p++) {
	    	for( int j=1;j<=i;j++) {
	    		System.out.print((char)p+" ");
	    	}
	    	System.out.println();
	    }
	}
	void p2() {
		   for(int i=1,p='A';i<=5;i++,p+=2) {
		    	for( int j=1;j<=i;j++) {
		    		System.out.print((char)p+" ");
		    	}
		    	System.out.println();
		    }
	}
	void p3() {
		for(int i=1;i<=5;i++) {                      //i=1       2
			int p='A';                               
	    	for( int j=1;j<=i;j++) {                  //A       AB
	    		System.out.print((char)p+++" ");
	    	}
	    	System.out.println();
		}
	}
	
	
	void p4() {
		for(int i=1;i<=5;i++) {                      //i=1       2
			int p='A';                               
	    	for( int j=5;j>=i;j--) {                  //A       AB
	    		System.out.print((char)p+++" ");
	    	}
	    	System.out.println();
		}
	}
	void p5() {
		for(int i=1;i<=5;i++) {                      //i=1       2
			int p='A';                               
	    	for( int j=5;j>=i;j--) {                  //A       AB
	    		System.out.print(" ");
	    	}
	    	for(int k=1;k<=i;k++) {
	    		System.out.print((char)p+++"");
	    	}
	    	System.out.println();
		}
	}
	void p6() {
		for(int i=1;i<=5;i++) {                      //i=1       2
			int p='E';                               
	    	for( int j=5;j>=i;j--) {                  //A       AB
	    		System.out.print(" ");
	    	}
	    	for(int k=1;k<=i;k++) {
	    		System.out.print((char)p+++" ");
	    	}
	    	System.out.println();
		}
	}
	void p7() {
		for(int i=1;i<=5;i++) {                      //i=1       2
			int p='E';                               
	    	for( int j=1;j<=i;j++) {                  //A       AB
	    		System.out.print(" ");
	    	}
	    	for(int k=5;k>=i;k--) {
	    		System.out.print((char)p+++" ");
	    	}
	    	System.out.println();
		}
	}
	void p8() {
		for(int i=1;i<=5;i++) {                      //i=1       2
			int p='E';                               
	    	for( int j=5;j>=i;j--) {                  //A       AB
	    		System.out.print(" ");
	    	}
	    	for(int k=1;k<=i;k++) {
	    		System.out.print((char)p+++" ");
	    	}
	    	System.out.println();
		}for(int i=2;i<=5;i++) {                      //i=1       2
			int p='E';                               
	    	for( int j=1;j<=i;j++) {                  //A       AB
	    		System.out.print(" ");
	    	}
	    	for(int k=5;k>=i;k--) {
	    		System.out.print((char)p+++" ");
	    	}
	    	System.out.println();
		}
		
	}
	void p9() {
		String s="CODER";
		int n=s.length();
		for(int i=1,p=0;i<=n;i++,p++) {                      //i=1       2                              
	    	for( int j=1;j<=i;j++) {                  //A       AB
	    		System.out.print(s.charAt(p)+" ");
	    	}
	    	System.out.println();
		}
	}
	void p10() {
		String s="CODER";
		int n=s.length();
		for(int i=1;i<=n;i++) {                      //i=1       2                              
	    	int p=0;
			for( int j=1;j<=i;j++) {                  //A       AB
	    		System.out.print(s.charAt(p++)+" ");
	    	}
	    	System.out.println();
		}
	}
	void p11() {
		for(int i=1,p='E';i<=5;i++,p++) {     //EDCBA
			for(int j=1;j<=i;j++) {           // DCBA
				System.out.print(" "); //  CBA
			}
			for(int k=5;k>=i;k--) {
				System.out.print((char)p+"");
			}
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char_patern any=new char_patern();
	      any.p1();
	      System.out.println();
	      any.p2();
	      System.out.println();
	      any.p3();
	      System.out.println();
	      any.p4();
	      System.out.println();
	      any.p5();
	      System.out.println();
	      any.p6();
	      System.out.println();
	      any.p7();
	      System.out.println();
	      any.p8();
	      System.out.println();
	      any.p9();
	      System.out.println();
	      any.p10();
	      System.out.println();
	      any.p11();
	      
	}

}
//A 
//B B 
//C C C 
//D D D D 
//E E E E E 
