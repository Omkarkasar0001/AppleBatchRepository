package Polymorphism;

public class Addition {
	
	
	void  add(int a,int b) {
		System.out.println("Addition of Two Number is        :"+(a+b));
	}
	
	/*
	 * void add(int a,int c) { System.out.println(" "+a+c); }
	 */
	void  add(int a,String b) {
		System.out.println("Addition of A Number and String  :"+a+" "+b);
	}
	
	
	void  add(String a,int b) {
		System.out.println("Addition of String annd Number   :"+a+" "+b);
	}
	
	void  add(String a,String b) {
		System.out.println("Addition of Two string           :"+a+" "+b);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Addition s1=new Addition();
		s1.add(100, 200);
		s1.add(100, "Omkar");
		s1.add("Omkar", 1000);
		s1.add("Omkar", "Kasar");

	}

}
