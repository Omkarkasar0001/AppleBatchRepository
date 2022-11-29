package all_over_practice;
//Over laoding using method
public class overlaoding1 {
	
	void sum(int a,int b) {
		System.out.println(" adddition   "+(a+b));
	}
	void sub(int a,int b) {
		System.out.println(" substration  "+(a-b));
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		overlaoding1 o1=new overlaoding1();
        o1.sub(10, 20);
        o1.sum(10, 20);
	

	}

}
