package static_Block;

public class Studentblock {
	int a = 10;
	static int b = 20;
	static int count;  //Value 0

	static {   //Static Block only access Static global variables only
		System.out.println(" " + b);
		/* System.out.println(" "+a; */
		count++;     //Value 1
		System.out.println("in Static block 1");
	}

	static {

		count++;    //Value 2
		System.out.println("in Static block 2");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(count);
	}

}
