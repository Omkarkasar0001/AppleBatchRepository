package Inheritance;
// Person,Using getter and setter
public class Person1 {
	private int id;
	private long contact;
	String name, address, email;
	AddressCon1 a1;
	
	
	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public long getContact() {
		return contact;
	}


	public void setContact(long contact) {
		this.contact = contact;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getAddress() {
		return address;
	}


	public void setAddress(String address) {
		this.address = address;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public AddressCon1 getA() {
		return a1;
	}


	public void setA(AddressCon1 a1) {
		this.a1=a1 ;
	}

	public String toString() {
		return id+" "+contact+" "+name+" "+address+" "+email+" "+a1;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
