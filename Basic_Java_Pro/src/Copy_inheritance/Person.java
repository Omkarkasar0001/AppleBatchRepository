package Copy_inheritance;
//Person
public class Person {
	private int id, contact;
	private String name, address, email;
	AddressCon a;

	/*
	 * Person() { id=01; contact=23456; name="Gokul"; address="pune";
	 * email="asdfghjkl"; }
	 */
	Person(int id, int contact, String name, String address, String email, AddressCon a) {
		this.id = id;
		this.contact = contact;
		this.name = name;
		this.address = address;
		this.email = email;
		this.a = a;

	}

	public String toString() {
		return +id + " " + contact + " " + name + " " + address + " " + email + " " + a;
	}
}
