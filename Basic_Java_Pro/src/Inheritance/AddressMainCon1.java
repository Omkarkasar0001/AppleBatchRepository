package Inheritance;

//Person,Using getter and setter
public class AddressMainCon1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AddressCon1 a1 = new AddressCon1();
		a1.setPincode(400001);
		a1.setCity("Mumbai");
		a1.setArea("Malad");
		a1.setState("Maharashtra");

		Person1 p1 = new Person1();
		p1.setId(101);
		p1.setName("Ravi");
		p1.setAddress("CIDCO");
		p1.setEmail("Ravi67@gmail.com");
		p1.setContact(9056666648l);
		p1.setA(a1);//no effect
		
		Person1 p2 = new Person1();
		p2.setId(102);
		p2.setName("Avinash");
		p2.setAddress("HUDCO");
		p2.setEmail("Avinash76@gmail.com");
		p2.setContact(896646648l);

		System.out.println(p1.getName() + " " + p1.getId() + " " + p1.getAddress() + " " + p1.getContact() + " "
				+ p1.getEmail() + " " +a1);
		System.out.println(p2.getName() + " " + p2.getId() + " " + p2.getAddress() + " " + p2.getContact() + " "
				+ p2.getEmail() + " " +a1);

	}

}
