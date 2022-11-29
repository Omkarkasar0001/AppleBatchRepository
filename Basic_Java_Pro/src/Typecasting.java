
public class Typecasting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double b = 13.5, h = 9.8;
		int a = (int) h;
		System.out.println("double to int (explicit) typecasting  :  " + a);

		int j = 45;
		double g = (double) j;
		System.out.println("int to double (implicit) typecasting  :  " + g);
		
		int m='a';
		char k=(char)m;
		System.out.println("int to char (explicit) typecasting  :  " +k);
		
		long r = 7030850661l;
		long y=(long)r;
		System.out.println("int to long (implicit) typecasting  :  " +y);   //7030850661 this by default are "int" so we converted them to long
		
		
		
	}

}
