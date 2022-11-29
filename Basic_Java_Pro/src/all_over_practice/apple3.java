package all_over_practice;
//Overlaoding using method
public class apple3{

	static int apple(int a, int b) {
		return a + b;
	}

	static int apple(int a, int b, int c) {
		return a + b + c;
	}

	public static void main(String[] args) {
		System.out.println(apple3.apple(10, 20));
		System.out.println(apple3.apple(10, 20, 30));

	}

}
