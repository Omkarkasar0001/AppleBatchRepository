package Polymorphism;
//Q.Can we Overload Main() Method?
public class OverlaodingMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Main with String array");//JVM always compile main method with Array only

	}
	
	public static void main(String args) {
		// TODO Auto-generated method stub
		System.out.println("Main with String");

	}
	public static void main() {
		// TODO Auto-generated method stub
		System.out.println("Main without args");

	}

}
