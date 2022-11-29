package Polymorphism_Written5;

public class PersonAddrMain {

	public static void main(String[] args) {
		Addr a = new Addr("pune", " maharashtra", "india");

		Person g1 = new Person();
		g1.setName("Omkar");
		g1.setAge(24);
		g1.setGender("male");
		System.out.println(a);
		

		System.out.println(g1);
	}
}