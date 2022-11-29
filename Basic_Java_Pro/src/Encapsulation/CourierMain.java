package Encapsulation;

public class CourierMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Courier c1 = new Courier();
		c1.setWeight(35);
		c1.setSubject("Offer_Letter");

		System.out.println(c1.getWeight() + "\n" + c1.getSubject());

	}

}
